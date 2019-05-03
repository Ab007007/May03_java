package com.synehcron.jt.exceptions;

public class ThrowsDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Strted");
		sleepForSomeTime();
		System.out.println("Main Ended");
	}
	
	
	public static void sleepForSomeTime() throws InterruptedException
	{
		Thread.sleep(3000);
	}
}
