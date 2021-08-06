package com.jit.boot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jit.boot.exception.EmployeeNotFoundException;
import com.jit.boot.model.Employee;
import com.jit.boot.repo.EmployeeRepository;
import com.jit.boot.service.IEmployeeService;

@Service // = @Component + Logics/cal + TxManagement
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo; // HAS-A

	public Integer saveEmployee(Employee e) {

		// ---calculations--
		Double sal = e.getEmpSal();
		Double hra = sal * 12 / 100;
		Double ta = sal * 3 / 100;

		// set data to model cls obj
		e.setEmpHra(hra);
		e.setEmpTa(ta);

		// save data in db
		// this method again returns same object
		// with PK updated value
		e = repo.save(e);

		// PK
		Integer empId = e.getEmpId();

		return empId;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> list = repo.findAll();
		return list;
	}

	public void deleteEmployee(Integer id) {
		// repo.deleteById(id);
		repo.delete(getOneEmployee(id));
	}

	/*
	 * public Optional<Employee> getOneEmployee(Integer id) { return
	 * repo.findById(id); }
	 */
	public Employee getOneEmployee(Integer id) {

		Optional<Employee> opt = repo.findById(id);
		if (opt.isEmpty()) {
			throw new EmployeeNotFoundException("Employee '" + id + "' Not exist");
		} else {
			return opt.get();
		}

		// return repo.findById(id).orElseThrow(() -> new
		// EmployeeNotFoundException("Employee '" + id + "' Not exist"));

	}

	public void updateEmployee(Employee e) {

		if (repo.existsById(e.getEmpId())) {
			Double sal = e.getEmpSal();
			Double hra = sal * 12 / 100;
			Double ta = sal * 3 / 100;

			e.setEmpHra(hra);
			e.setEmpTa(ta);

			repo.save(e);
		}
	}

	@Override
	public boolean isEmployeeEmailExist(String empMail) {
		/*
		 * Integer count = repo.getEmployeeEmailCount(empMail); boolean isExist = count
		 * > 0 ? true:false; return isExist;
		 */
		return repo.getEmployeeEmailCount(empMail) > 0;
	}

	@Override
	public Page<Employee> getAllEmployees(Pageable pageable) {
		return repo.findAll(pageable);
	}

}
