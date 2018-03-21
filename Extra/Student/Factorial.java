package student;
import java.util.*;

public class Factorial
{
	int num,product=1;

	void fact_num()
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number whose factorial is to be calculated : ");
		num=s.nextInt();


		for(int i=num;i>0;i--)
		{
			product*=i;
		}

	
		System.out.println("The factorial is : "+product);
	
	}

	public static void main(String args[])
	{
		Factorial obj=new Factorial();
		obj.fact_num();
	}
}