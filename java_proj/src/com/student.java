package com;

public class student
{
	private int marks;
	private int rollno;
	private String name;
	private String collegeName;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "student1 [marks=" + marks + ", rollno=" + rollno + ", name=" + name + ", collegeName=" + collegeName
				+ "]";
	}
	
}
