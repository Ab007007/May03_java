package com.synehcron.jt.exceptions;

public class ExceptionsDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Main Strted");
		try
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Ended");
	}
	
}
