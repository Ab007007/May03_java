package com.synehcron.jt.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo
{
	public static void main(String[] args)
	{
		Set hs = new HashSet();
		String choice = null;
		
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("enter the elements to store");
			int ele  = sc.nextInt();
			hs.add(ele);
			
			System.out.println("Do you want to add some more- press y/n");
			choice =  sc.next();
		}while(choice.equalsIgnoreCase("y"));
		
		System.out.println("total elements in collection is " + hs.size());
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(hs.contains(123));
	}
}
