import java.util.*;

class test
{
	public static void main(String[] args)
	{
	int []arr={4,6,7,8};
	Scanner s=new Scanner(System.in);

	System.out.println("Enter first num");
	int a=s.nextInt();

	System.out.println("Enter second num");
	int b=s.nextInt();

	 System.out.println("Enter pos of array u wanna fetch");
	 int pos=s.nextInt();

	try
	    {
	     int c=a/b;
	     System.out.println("res :"+c);
	    System.out.println("arr:"+arr[pos]);
	     }
	catch(ArithmeticException e)
	          {
		System.out.println(e);
	          }
	
	
	 catch(ArrayIndexOutOfBoundsException e)
	          {
		System.out.println(e);
	          }	
	
	 catch(Exception e)
	          {
		System.out.println(e);
	          }
	System.out.println("Rest of code");

	}	//main ends

 }	//class ends