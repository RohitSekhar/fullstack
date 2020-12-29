package com;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStream {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		try
		{
			java.io.FileInputStream fis=new java.io.FileInputStream("abcd.txt");
			int count=fis.read();
			System.out.println(count);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
