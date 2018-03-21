package student;
import java.util.*;

class Largest
{
	int array[]=new int[5];
	int max;

	void largest_num()
	{
	
		Scanner s=new Scanner(System.in);

		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the" + "\t"+ i + "\t" + " number");
			array[i]=s.nextInt();
		}

		max=array[0];

		for(int i=0;i<5;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
	}

	System.out.println("Largest value is : "+max);
	}

	
	public static void main(String args[])
	{
	Largest obj=new Largest();
	obj.largest_num();
	}
}