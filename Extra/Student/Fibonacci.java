package student;
import java.util.*;

class Fibonacci
{
	int num,i=0,j=1,temp;

	void fibo_num()
	{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of terms of the series : ");
	num=s.nextInt();
	
	System.out.println(i+"\n"+j);

	for(int k=0;k<num-2;k++)
	{
	temp=i+j;
	System.out.println("\n"+temp);
	i=j;
	j=temp;
	}

	
	}

	public static void main(String args[])
	{
	Fibonacci obj=new Fibonacci();
	obj.fibo_num();
	}
}