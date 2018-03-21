package student;
import java.util.*;

public class Armstrong
{
	int num,check=0,remainder;

	void arms()
	{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number to be checked for Armstrong's number");
	num=s.nextInt();

	int n=num;

	while(num>0)
	{
	remainder=num%10;
	check=check+(int)Math.pow(remainder,3);
	num/=10;
	}

	if(check==n)
	{
	System.out.println("It is an armstrong no");
	}
	else
	{
	System.out.println("It is not an Armstrong no");
	}
	}

	public static void main(String args[])
	{
	Armstrong obj=new Armstrong();
	obj.arms();
	}
}