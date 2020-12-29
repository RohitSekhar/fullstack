package com;
class A implements Runnable
{
     void display()
     {
    	 for(int i=0; i< 10;i++)
         System.out.println("welcome!!");
     }
    @Override
    public void run() 
    {
        // TODO Auto-generated method stub    
    }    
}
public class threading 
{
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        System.out.println("multithreading");
         A a1=new A();
         Thread t = new Thread(a1);
    t.start();
    System.out.println(t);      
    }    
}