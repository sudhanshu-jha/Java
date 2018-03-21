package student;
import java.util.*;

class Smallest
{
	int array[]=new int[5];
	int max;

	void smallest_num()
	{
	
		Scanner s=new Scanner(System.in);
		

		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the"+i+"\t"+"number:");
			array[i]=s.nextInt();
		}

		max=array[0];

		for(int i=0;i<5;i++)
		{
			if(array[i]<max)
			{
				max=array[i];
			}
	}

	System.out.println("Smallest value is :"+max);
	}

	
	public static void main(String args[])
	{
	Smallest obj=new Smallest();
	obj.smallest_num();
	
	}
}