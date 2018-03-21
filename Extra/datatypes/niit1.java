
class niit1
{
	int id;
	String name;
	
	void accept(int i, String s)
	{
		id=i;	name=s;	
	}
	void disp()
	{
		System.out.println(id);
		System.out.println(name);
	}
		

	public static void main(String[] args)
	{
		System.out.println("Welcome");
		niit1 obj=new niit1();
		obj.accept(101,"Admin");
		obj.disp();
		
		
		niit1 obj2=new niit1();
		obj2.accept(102,"Sud");
		obj2.disp();

		
	}

}