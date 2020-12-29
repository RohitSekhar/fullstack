import java.util.*;  
class markslist
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter the marks obtained- ");  
		float marks= sc.nextFloat();  
		if(marks >= 45 && marks<=100)
		{
			if(marks>=45 && marks<50)
			System.out.println("P");
			else if(marks>=50 && marks<60)
			System.out.println("C");
			else if(marks>=60 && marks<70)
			System.out.println("B");
			else if(marks>=70 && marks<80)
			System.out.println("B+");
			else if(marks>=80 && marks<85)
			System.out.println("A");
			else if(marks>=85 && marks<90)
			System.out.println("A+");
			else 
			System.out.println("O");
		}
		else if(marks>=0 && marks<45)
		System.out.println("F");
		else
		System.out.println("Invalid marks");
	}
}