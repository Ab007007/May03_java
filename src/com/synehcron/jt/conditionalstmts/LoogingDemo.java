package com.synehcron.jt.conditionalstmts;

import java.util.Scanner;

public class LoogingDemo
{

	public static void main(String[] args)
	{
		System.out.println("Welcome to Table Generation");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number for which you want to gererate table");
		int num =  sc.nextInt();
		
		for (int i = 1; i <= 20; i++)
		{
			System.out.println(num + " * " + i + " = "  + num * i);
		}
		
	}
}
