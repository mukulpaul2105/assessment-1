package com.sapient.endur.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sapient.endur.model.Employee;

public interface EmployeeService {

//	public static getEmployeeWithHighestSalary(List<Employee> employeesList) {
//		Stream<Employee> st = employeesList.stream();
//		Optional<Employee> stream = st
//				.map( (s) -> s.getSalery())
//				.min( (p1, p2) -> p1.compareTo(p2));
//		return stream.get();
//		
//	}
	
	
	public static List<Employee> getEmployeesOfGivenJob(List<Employee> employeesList, String job) {
		Stream<Employee> st = employeesList.stream();
		List<Employee> list = st
				.filter((f) -> f.getJob().equals(job))
				.collect(Collectors.toList());
		return list;
				
	}
	
	
	public static double getTotalSalary(List<Employee> employeesList) {
		Stream<Employee> st = employeesList.stream();
		double totolSalery = st
				.map( (c) -> c.getSalary())
				.reduce( (p1, p2) -> p1 + p2)
				.get();
		return totolSalery;
	}
	
}
