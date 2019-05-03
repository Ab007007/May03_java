package com.synehcron.jt.generics;

import java.util.ArrayList;
import java.util.List;

import com.synehcron.jt.constructor.Employee;

public class GenericsDemo
{
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		
		
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al.size());
		for(Integer i:al)
		{
			System.out.println(i);
		}
	}

}
