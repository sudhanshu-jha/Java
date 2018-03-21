import java.util.*;
class niit2
{
	int id;
	String name;
	
	void accept()
	{
		Scanner s=new Scanner (System.in);
		System.out.print("Enter ur id--->");
		id=s.nextInt();
		System.out.print("Enter ur  name--->");
		name=s.next();	
	}
	
	void disp()
	{
		System.out.println("__________");
		System.out.println("your id is--->"+id);
		System.out.print("your nameid--->"+name);
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome");
		niit2 obj=new niit2();
		obj.accept();
		obj.disp();
							
	}
}