package com.synehcron.jt.constructor;

import com.synehcron.jt.staticblock.StaticBlockDemo;

/**
 * Employee class to store employee details
 * @version v1
 * @author Aravind
 *
 */
public class Employee 
{
	String employeeId;
	String doj;
	double salary;
	
	/**
	 * overided function to get employee details
	 * @author Aravind
	 */
	public String toString()
	{
		return "Object Values are - Employee ID - " + this.employeeId + " and doj - " + this.doj + " and salary - " + this.salary;
	}
	/**
	 * Constructor
	 */
	public Employee()
	{
		super();
		System.out.println("i'm a constructor.....");
	}
	/**
	 * 
	 * @param employeeId - any id of an employee 
	 * @param doj - date of joining of an employee
	 * @param salary - confidential field
	 */
	public Employee(String employeeId, String doj, double salary)
	{
		System.out.println(" Para constructor is called....");
		this.employeeId = employeeId;
		this.doj = doj;
		this.salary = salary;
	}
	
	public static void main(String[] args)
	{
		Employee e1  = new Employee();

		e1.employeeId="XYZ-employee";
		System.out.println(e1.employeeId);    //null
		
		Employee e2 =  new Employee("Employee-1","02-05-2018",1200000);
		Employee e3 =  new Employee("Employee-2","02-05-2017",1300000);
		
		System.out.println(e2);
		System.out.println(e3);
		
		
	}
}
