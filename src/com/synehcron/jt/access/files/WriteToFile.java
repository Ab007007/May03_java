package com.synehcron.jt.access.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("data/newfile.txt");
		
		FileWriter fw = new FileWriter(f, true);
		
		BufferedWriter br = new BufferedWriter(fw);
		br.write("Hi i'm writing through program adfasdf");
		br.newLine();
		
		br.close();
		fw.close();
		
		
		
	}
}
