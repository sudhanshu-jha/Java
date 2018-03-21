package student;
import java.util.*;

class welcome
{
	public void welcome_user()
	{
 	 Scanner s=new Scanner(System.in);
     System.out.println("Enter your option");
	 System.out.println("1 for largest number\n 2 for Smallest number\n 3 for Swapping\n 4 for prime number\n 5 for Factorial number \n 6 for fibonacci number\n 7 for pallindrome");
	 int opt=s.nextInt();

	switch(opt)
	{		
	case 1:
		largest obj1=new largest();
		obj1.largest_num();
		break;
   case 2:
		Smallest obj2=new Smallest();
		obj2.Smallest_num();
		break;
	case 3:
		Swapping obj3=new Swapping();
	    obj3.swap();
		break;
	case 4:
		Prime obj4=new Prime();
		obj4.Prime_num();
		break;
	case 5:
		Armstrong obj=new Armstrong();
		obj5.Armstrong_num();
		break;
	case 6:	
		Factorial obj=new Factorial();
	    obj6.fact_num();
		break;
	case 7:
		Fibonacci obj=new Fibonacci();
		obj7.fib();
		break;
	case 8:
		Palindrome obj=new Palindrome();
	    obj.pal_num();

	default:
		System.out.println("Invalid option");
		
 }    
	
  }
		
    public static void main(String  args[])
   {
	welcome obj=new welcome();
	obj.welcome_user();
   }
}   