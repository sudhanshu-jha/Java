package student;
import java.util.*;

class Swapping
{
	int num1,num2,num3;

	void swap()
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=s.nextInt();
		
		System.out.println("Enter the second number");
		num2=s.nextInt();
		
		num3=num1;
		num1=num2;
		num2=num3;

		System.out.println("First number now is : "+num1);
		System.out.println("Second number now is : "+num2);
		
	}

	
	public static void main(String args[])
	{
	Swapping obj=new Swapping();
	obj.swap();
	}
}