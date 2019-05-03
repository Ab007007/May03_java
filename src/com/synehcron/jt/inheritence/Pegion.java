package com.synehcron.jt.inheritence;

public class Pegion extends Bird
{
//arunravi2704@gmail.com
	
	String family = "Pegion";
	
	public static void main(String[] args)
	{
		Pegion p1 = new Pegion();
		//Bird b1 = new Bird();
		Bird p2 = new Pegion();
		
		
		p1.color = "Gray";
		p2.color = "Gray";
		p1.eyes = 2;
		
		System.out.println(p1.color);
		//System.out.println(b1.color);
		System.out.println(p1.eyes);
		System.out.println(p1.family);
		p1.distanceItFly();
		p1.soundItMakes();
		p1.livesIn();
	}
	
	
	public void distanceItFly()
	{
		System.out.println("Flys for max 1 KM");
	}
	
	public void soundItMakes()
	{
		System.out.println("not a good sound ");
	}
	
	public void livesIn()
	{
		System.out.println("Lives in city");
	}
}
