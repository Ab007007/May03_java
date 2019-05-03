package com.synehcron.jt.variables;

public class VariablesDemo
{
	int globalInt=100;
	public static void main(String[] args)
	{
		VariablesDemo vObj = new VariablesDemo();
		int a=10;
		double d=10.5;
		boolean b=true;
		char c='a';
		String str = "my name is Aravind";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(str);
		System.out.println(vObj.globalInt);
		vObj.test();
	}
	
	void test()
	{
		System.out.println("**********************************************");
		System.out.println(globalInt);
		System.out.println("i'm a test method...");
	}
	
	static void test2()
	{
		System.out.println("i'm a static method");
	}
}
