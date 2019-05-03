package com.synehcron.jt.variables;

public class PersonManager
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Employee1";
		p1.age = 35;
		p1.dob= "19-06-1980";
		p1.company = "IBM";
		p2.name = "Employee2";
		p2.age = 36;
		p2.dob= "19-06-1980";
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.dob);
		System.out.println(p1.company);
		//p2.country = "USA";
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.dob);
		System.out.println(p2.company);
		System.out.println(p2.country);
		
		
	}

}


class Person
{
	String name;
	int age;
	String dob;
	static String company = "Synechron";
	final static String country = "India";
}














