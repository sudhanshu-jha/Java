import java.util.*;
class niit
{
	int id;
	String name;
	
	void accept()
	{
		id=101;	name="admin";	
	}
	void disp()
	{
		System.out.println(id);
		System.out.println(name);
	}
		

	public static void main(String[] args)
	{
		System.out.println("Welcome");
		niit obj=new niit();
		obj.accept();
		obj.disp();
	}

}