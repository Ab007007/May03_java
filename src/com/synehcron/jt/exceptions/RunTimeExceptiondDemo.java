package com.synehcron.jt.exceptions;

public class RunTimeExceptiondDemo
{

	public static void main(String[] args)
	{
		System.out.println("main started");
		
		int a[] = new int[2];
	
		try
		{
			System.out.println(a[26]);
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("Please check the String index");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Please check the index of an array-->" + ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("generic exception");
		}
		System.out.println("main ended");
	}
}
