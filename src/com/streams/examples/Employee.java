package com.streams.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//import JavaCodeExamples.Employee;

public class Employee {
	
	private String name;
	
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private int age;
	private double salary;
	
	

	

	public Employee(String name, double salary, int age, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<Employee> employees = Arrays.asList(
				 new Employee("Jon", 8000, 20,"MANAGER"),
		            new Employee("Alex", 70000, 30,"IT"),
		            new Employee("Brian", 6000, 30 ,"HR"),
		            new Employee("Mike", 30000, 45 ,"IT"),
		            new Employee("Phil", 70000, 20,"IT"),
		            new Employee("Sam", 6000, 20 , "IT"),
		            new Employee("Simts", 6000, 20 , "HR"),
		            new Employee("mohit", 6000, 20 , null)
		);
		
		
		//QUESTION 01:
		/*
		 * Sort employees by:
		Salary → Descending
		Age → Ascending
		Name → Alphabetical*/
		
		
		List<Employee> newList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
				.thenComparing(Employee::getAge)
				.thenComparing(Employee::getName))
				.collect(Collectors.toList());
		
		// newList.forEach(System.out::println);
		
		System.out.println("=========================QUESTION 02:===================================");
		//QUESTION 02:
		/*Sort with NULL Values
		 * Sort employees by department, but department can be null.
		 * */
		
		employees.sort(Comparator.comparing(
				Employee::getDept , Comparator.nullsFirst(Comparator.naturalOrder()))
				);
		
		// employees.forEach(System.out::println);
		
		System.out.println("=========================QUESTION 03:===================================");
		
		//QUESTION: 03
		/*Custom Sorting of Strings with Numbers 
		 * ["emp10", "emp2", "emp1", "emp20"]
		 * */

		List list = Arrays.asList("emp10", "emp2", "emp1", "emp20");
		
		list.sort(Comparator.comparingInt(s -> Integer.parseInt(s.toString().replaceAll("\\D", ""))));
		list.forEach(System.out::println);
	}
	
	
	

}
