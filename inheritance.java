class inherit
{ 
 	inherit()    
	{
		System.out.println("hi");
	}  
}
class xyz extends inherit
{   
	void disp()
	{  
		System.out.println("how r u?");
	} 
}
class inheritance
{  
 	public static void main(String args[])
	{   
		 System.out.println("Inheritance");   
 		xyz s = new xyz();     
		s.disp(); 
	}}