import java.util.*;

class myexcep extends Exception{
		myexcep(String s){
	super(s);
	}
}

class test1
{
	void check(int tic) throws myexcep
	{
	   if(tic>10)
	         {
		throw new myexcep("no tickets available try next time");	
	         }
	else
	     {
		System.out.println("tickets available book now");
	     }
	}
}

class test
{
	public static void main(String args[])
	{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Welcome");
	
	System.out.println("press 1 to book");
	int choice=s.nextInt();
	
	System.out.println("Enter the number of ticket to be booked");
	int ch=s.nextInt();
		
	test1 obj=new test1();
	System.out.println("your ticket booked are\t"+ch);
	
	try 
	{
	obj.check(ch);
	}
	
	catch(myexcep e)
	{
	    e.printStackTrace();
	}
	
  }
}

	

