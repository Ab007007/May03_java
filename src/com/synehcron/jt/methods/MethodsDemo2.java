package com.synehcron.jt.methods;

public class MethodsDemo2
{

	int globalValue=0;
	public static void main(String[] args)
	{
		test1();
	}
	
	
	public static void test1()
	{
		test2();
		System.out.println("Static method test1  --> ");
	}
	
	public static void test2()
	{
		test3();
		System.out.println("non-static method test2-- > ");
	}
	
	public static final void test3()
	{
		test4();
		System.out.println("test3 method-- >");
		int a;
		
	}
	
	public static int test4()
	{
		System.out.println("Test4 is called ...");
		return 0;
	}
	
	
}
