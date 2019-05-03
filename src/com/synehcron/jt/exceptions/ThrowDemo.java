package com.synehcron.jt.exceptions;

public class ThrowDemo
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("i'm in try");
			
		}
		catch(Exception ex )
		{
			System.out.println("exception");
		}
		finally
		{
			System.out.println("finally");
		}
	}
}
