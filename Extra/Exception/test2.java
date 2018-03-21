import java.util.*;

class myexcep extends Exception
{
	myexcep(String s)
	{
	super(s);
	}
}

class test3
{
	void check(int age) throws myexcep
	{
		if(age<18)
		{
		throw new myexcep("U r not valid user");
		}
		else
		{
		System.out.println("Valid user");
		}
	}//end check 
}//end class

class test2{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter ur age");
	int age=s.nextInt();
	
	test3 obj=new test3();
	try
	{
	obj.check(age);
	}
	catch (myexcep e)
	{
	e.printStackTrace();
	}
}//end main
}//end class