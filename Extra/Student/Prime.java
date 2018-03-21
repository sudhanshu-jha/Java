package student;
import java.util.*;

class Prime
{
	void Prime_num()
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be checked for prime");
		int num=s.nextInt();
		int f=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+"is not a Prime Number");
					f=1;
					break;
				}
			}
			if(f==0)
				System.out.println(num+"is  Prime Number");
		}
		
		
	public static void main(String args[])
	{
	Prime obj=new Prime();
	obj.Prime_num();
	}
		
 }

	
