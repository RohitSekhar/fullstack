class loopingdemo
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Demo for looping");
		for(i=1;i<=10;i++)
		{
			System.out.println("Hello");
		}
		System.out.println("Demo while looping");
		i=0;
		while(i<10)
		{
			System.out.println("hello");
			i++;
		}
		i=0;
		System.out.println("Demo do while looping");
		do
		{
			System.out.println("Hello");
			i++;
		}while(i<10);
		System.out.println("Switching demo");
		i=2;
		switch (i) 
		{
      			case 1:
				System.out.println("Case 1");
				break;
     			case 2:
        			System.out.println("Case 2");
				break;
      			case 3:
        			System.out.println("Case 3");
				break;
      			default:
        			System.out.println("Default case");
				break;    
		}
  	}
}				
