package com.synehcron.jt.conditionalstmts;

import java.util.Scanner;

public class SwitchDemo
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Grade ");
		Scanner sc = new Scanner(System.in);
		String grade = sc.next();

		switch (grade)
		{
		case "A":
			System.out.println("Score is between 85%-95%");
			break;
		case "B":
			System.out.println("Score is between 75%-85%");
			break;
		case "C":
			System.out.println("Score is between 65%-75%");
			break;
		case "D":
			System.out.println("Score is less than 60%");
			break;

		default:
			System.out.println("Please enter valid grade");
			break;
		}
		sc.close();
	}
}
