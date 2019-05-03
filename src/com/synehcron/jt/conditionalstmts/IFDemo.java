package com.synehcron.jt.conditionalstmts;

import java.util.Scanner;

public class IFDemo
{
	public static void main(String[] args)
	{
		System.out.println("Finding largest number");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a =  sc.nextInt();

		System.out.println("Enter the second number");
		int b =  sc.nextInt();
		
		if(a>b)
		{
			System.out.println("First Number a  is greater number");
		
		}
		else if(b>a)
		{
			System.out.println("Second Number a  is greater number");
		}
		else
		{
			System.out.println(" Both are equal ");
		}
	}
}
