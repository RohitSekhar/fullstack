package com;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class MainApp 
{
	public static void main(String[] args)throws IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		student s1=new student(289,"Rohit",3333);
		student s2=new student(234,"aaa",222);
		student s3=new student(212,"sss",3423);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		try
		{
			FileOutputStream fos=new FileOutputStream("hello.txt");
			ObjectOutputStream ous=new ObjectOutputStream(fos);
			ous.writeObject(s1);
			ous.writeObject(s2);
			ous.writeObject(s3);
			ous.close();
			System.out.println("Written data to file");
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Feteching data from file");
		int i=1;
		while(i<=3)
		{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("hello.txt"));
			student s=(student)ois.readObject();
			System.out.println("Marks "+s2.marks);
			System.out.println("name "+s2.name);
			System.out.println("mobile num"+s2.mobno);
			i++;
		}
	}
}