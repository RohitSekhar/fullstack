package com;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileOutputDemo 
{	
	public static void main(String[] args)throws IOException
	{
			try
			{
				FileOutputStream fos=new FileOutputStream("abcd.txt");
				fos.write(185);
				fos.close();
				System.out.println("written in file successfully");
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			FileOutputStream fos=new FileOutputStream("abcd.txt");
			String str="Hi adipoli";
			byte b[]=str.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("done");
	}

}
