package com.synehcron.jt.variables;

public class GlobalVariablesDemo
{

	int a=10;   //instance variable or Object variable or non-static variable
	static int b = 20;   //static variable or Class variable
	
	public static void main(String[] args)
	{
		GlobalVariablesDemo gd1 = new GlobalVariablesDemo();
		GlobalVariablesDemo gd2 = new GlobalVariablesDemo();
		GlobalVariablesDemo gd3 = new GlobalVariablesDemo();
		GlobalVariablesDemo gd4 = new GlobalVariablesDemo();
		System.out.println(gd1.a);
		System.out.println(b);
		System.out.println(gd2.a);
		System.out.println(b);
		System.out.println(gd3.a);
		System.out.println(b);
		System.out.println(gd4.a);
		System.out.println(b);
		
	}
	
}
