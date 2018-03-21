package student;
import java.util.*;

class Palindrome
{
	void pal_num()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number to be checked for palindrome");
	int num=s.nextInt();
	int rev=0,remainder;
	int n=num;
	while(num>0)
	{
		remainder=num%10;
		rev=rev*10+remainder;
		num=num/10;
	}
	if (rev==n)
		System.out.println(n+"is a palindrome number");
	else
		System.out.println(n+"is not a palindrome number");
	
	}
	
	public static void main(String args[])
	{
	Palindrome obj=new Palindrome();
	obj.pal_num();
	}
	
}
	

