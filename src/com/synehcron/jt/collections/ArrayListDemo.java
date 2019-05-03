package com.synehcron.jt.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.synehcron.jt.variables.PersonManager;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		List al = new ArrayList();
		
		al.add(123);
		al.add("abcd");
		al.add(20.2);
		al.add(true);
		al.add(new PersonManager());
	
		printCollection(al);
	
		al.add(0, "new element");

		printCollection(al);
		
		al.remove(true);
		
		printCollection(al);
	}

	private static void printCollection(List al)
	{
		System.out.println("------------------------------------------------------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println("Element at " + i + " index is " + al.get(i));
		}
		
		
		/*
		 * for (Object a : al) { System.out.println(a); }
		 */
//		
//		Iterator it  =  al.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
	}

}








