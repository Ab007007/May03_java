package com.synehcron.jt.methods;

public class MethodsDemo
{

	int globalValue=0;
	public static void main(String[] args)
	{
	
		MethodsDemo m = new MethodsDemo();
		test1();
		test3();
		int x = test4();
		System.out.println("Printing value from main method-->  " + x);
		m.test2();
	}
	
	
	public static void test1()
	{
		int a = 0;
		System.out.println("Static method test1  --> " + a);
	}
	
	public void test2()
	{
		int a = 10;
		System.out.println("non-static method test2-- > "+ a);
	}
	
	public static final void test3()
	{
		int a = 100;
		System.out.println("final method-- > "+ a);
	}
	
	public static int test4()
	{
		int a =1000;
		return a;
	}
	
	
}
