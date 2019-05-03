package com.synehcron.jt.conditionalstmts;

import java.util.Scanner;

public class WileLoopDemo
{

	public static void main(String[] args)
	{
		Scanner sc = null;
		String choice =null;
		System.out.println("Welcome to Table Generation");
		do
		{
			sc =  new Scanner(System.in);
			System.out.println("Enter the number for which you want to gererate table");
			int num =  sc.nextInt();
			
			int i =1;
			
			while(i<=20)
			{
				System.out.println(num + " * " + i + " = "  + num * i);
				i++;
			}
			System.out.println("Do you want to continue yes/no");
			choice = sc.next();
		}while(choice.contentEquals("yes"));
		System.out.println("Program is ended..");
		sc.close();
	}
}
