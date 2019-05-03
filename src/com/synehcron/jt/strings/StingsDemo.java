package com.synehcron.jt.strings;

public class StingsDemo
{
	public static void main(String[] args)
	{
		String str = "aBCd efgh ijkle";
		
		
		
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf("e"));
		System.out.println(str.lastIndexOf("e"));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String[] words = str.split(" ");
		
		/*
		 * for (int i = 0; i < words.length; i++) { System.out.println(words[i]); }
		 */
		
		for(String word:words)
		{
			System.out.println(word);
		}
		
	}
}
