package com.synehcron.jt.strings;

public class SplitDemo
{
	public static void main(String[] args)
	{
		String userdetails = "Name:Aravind;Age:33;Mobile:9955995599";
		
		String[] details = userdetails.split(";");
		
		for(String detail:details)
		{
			System.out.println(detail.substring(detail.indexOf(":")+1, detail.length()));
		}
	}
}
