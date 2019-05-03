package com.synehcron.jt.methods;

public class AdditionDemo
{
	public static void main(String[] args)
	{
		int a, b, c;
		
		a = 10;
		b = 20;
		sum(a, b);
		sum(b,a);
		sum(25,30);
		sum(25.5,35.5);
		sum("a","b");
		sum(25,30.5);
		
	}

	private static void sum(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("sum of two numbers is " +c );
	}
	
	public static void sum(double a, double b)
	{
		double d;
		d = a + b;
		System.out.println("sum of two numbers is " +d );
		
	}
	public static void sum(String a, String b)
	{
		String d;
		d = a + b;
		System.out.println("sum of two numbers is " +d );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
