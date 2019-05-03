package com.synehcron.jt.strings;

public class StringBufferDemo
{
	public static void main(String[] args)
	{
		StringBuffer sb =  new StringBuffer();
		
		sb.append("abcd");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("124");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb.reverse());
	}

}
