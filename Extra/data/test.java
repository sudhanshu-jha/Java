import java.util.*;

class test
{
	String name;
	int id;
	String insti;
	
	test(String insti)
	{
		insti="NIIT";
	}
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur name");
		name=s.next();
		
		System.out.println("Enter ur id");
		id=s.nextInt();
		
		System.out.println("Enter ur insti");
		insti=s.next();				
	
	}
	
	void disp()
	{
		System.out.println("Your name is --->"+name);
		System.out.println("Your id is --->"+id);
		System.out.println(insti);		
	}
	
	public static void main(String[]  args)
	{
	System.out.println("Welcome");
	//test obj=new test();
	test obj=new test("NIIT");
	//obj.scan();
	obj.input();
	obj.disp();
	}	
	
}