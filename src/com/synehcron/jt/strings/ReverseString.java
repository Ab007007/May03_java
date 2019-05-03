package com.synehcron.jt.strings;

public class ReverseString
{
	public static void main(String[] args)
	{
		String str = "hi how are you today????";
		
		System.out.println(str);
		for (int i = str.length()-1; i >=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
