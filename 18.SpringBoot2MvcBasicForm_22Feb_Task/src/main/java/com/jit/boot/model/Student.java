package com.jit.boot.model;

import java.util.Set;

import lombok.Data;

@Data
public class Student {
	private Integer sid;
	private String sname;
	private Double sfee;
	private String sgender;
	private String saddress;
	private String smobileno;
	private String semail;
	private String scourse;
	private Set<String> timeslots;
	private Set<String> certificates;
}
