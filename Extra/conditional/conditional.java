import java.util.*;

class conditional
{
	int marks;
	void check()
	{
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the marks--->");
		int marks=s.nextInt();
		
		if(marks<=100  && marks>90)
		{
 		System.out.println("A");
		}
		
		else if(marks<=90 && marks>80 )
		{
			System.out.println("B");
		}
		else if(marks<=80  && marks>70)
		{
			System.out.println("C");
		}
		else if(marks<=70 && marks>60)
		{
			System.out.println("D");
		}
		else if(marks<=60 && marks>50)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}		
	
	public static void main(String[]  args)
	{
	System.out.println("Welcome");
	conditional obj=new conditional();
	obj.check();
	}	
	
}