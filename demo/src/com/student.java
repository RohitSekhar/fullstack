package com;
import java.io.Serializable;
public class student implements Serializable
{
	int marks;
	String name;
	int mobno;
	student(int x,String y,int z)
	{
		marks=x;
		name=y;
		mobno=z;
	}
	@Override
	public String toString() {
		return "student [marks=" + marks + ", name=" + name + ", mobno=" + mobno + "]";
	}
}
	