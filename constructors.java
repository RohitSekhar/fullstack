class constructors
{  
    	int id;  
    	constructors(int i)	
	{  
    		id = i;  
    	}  
        void display()
	{
		System.out.println(id);
	}  
   	public static void main(String args[])
	{  
     		constructors s1 = new constructors(111);  
    		constructors s2 = new constructors(222);  
    		s1.display();  
    		s2.display();  
   	}  
}  