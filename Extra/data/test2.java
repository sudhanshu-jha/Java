import java.util.*;
class test2
{
	int[] id=new int[5];
	
	void accept()
	{
	  Scanner s=new Scanner(System.in);

	  for(int i=0;i<5;i++)
	   {
	     System.out.print("Enter your id :-");	
	    id[i]=s.nextInt();
	   }
	    System.out.println("Displaying....."+"\n");
	}
	void disp()
	{	
	   for(int i=0;i<5;i++)
	   {
	   System.out.println("The id entered are\t"+id[i]);
	   }		
	}
	
	public static void main(String[]   args)
	{
	test2 obj=new test2();
	obj.accept();
	obj.disp();
	}
}