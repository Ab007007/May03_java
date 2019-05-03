package com.synehcron.jt.access.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo
{

	public static void main(String[] args) throws IOException
	{
		File f = new File("data/data.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		br.close();
		fr.close();
		
	}
}
