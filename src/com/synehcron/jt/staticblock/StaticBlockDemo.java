package com.synehcron.jt.staticblock;

public class StaticBlockDemo
{
	static int counter=0;
	static
	{
		System.out.println("i'm executing before main");
	}
	
	{
		counter++;
		System.out.println("Total objects " + counter);
	}
	
	public static void main(String[] args)
	{
		System.out.println("main is starting...");
		
		StaticBlockDemo sb1 = new StaticBlockDemo();
		StaticBlockDemo sb2 = new StaticBlockDemo();
		StaticBlockDemo sb3 = new StaticBlockDemo();
		StaticBlockDemo sb4 = new StaticBlockDemo();
		StaticBlockDemo sb5 = new StaticBlockDemo();
		StaticBlockDemo sb6 = new StaticBlockDemo();
		StaticBlockDemo sb7 = new StaticBlockDemo();
		StaticBlockDemo sb8 = new StaticBlockDemo();
		StaticBlockDemo sb9 = new StaticBlockDemo();
		StaticBlockDemo sb10 = new StaticBlockDemo();
		StaticBlockDemo sb11 = new StaticBlockDemo();
		
	}
}
