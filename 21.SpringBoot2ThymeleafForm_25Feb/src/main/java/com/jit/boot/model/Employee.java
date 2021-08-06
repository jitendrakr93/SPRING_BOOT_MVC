package com.jit.boot.model;

import java.util.List;

import lombok.Data;

@Data
public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;
	private String empGen;
	private String empProj;
	private String empAddr;
	private List<String> empLangs;
}
