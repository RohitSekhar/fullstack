package com;
import java.io.IOException;
import java.util.Scanner;
public class employee 
{
	public static void main(String[] args)throws IOException
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of string");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the "+(i+1)+"th element");
			a[i]=sc.nextInt();
		}
		System.out.println("The array is ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}
}