package com.synehcron.jt.files;

import java.io.File;

public class FilesDemo
{
	public static void main(String[] args)
	{
		File f = new File("D:\\AravindData\\Java slides");
		 File[] files = f.listFiles();
		 
		 for(File file:files)
		 {
			 if(file.isDirectory())
			 {
				 System.out.println("[DIR]" + file.getAbsolutePath());
//				 System.out.println(file.canExecute());
//				 System.out.println(file.canRead());
//				 System.out.println(file.canWrite());
			 }
			 else if(file.isFile())
			 {
				 System.out.println("[FILE]" + file.getAbsolutePath());
//				 System.out.println(file.canExecute());
//				 System.out.println(file.canRead());
//				 System.out.println(file.canWrite());
			 }
		 }
	}
}
