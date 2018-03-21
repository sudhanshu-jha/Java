class parent
{
	parent()
	{
		System.out.println("no arg const of parent");
	}
	parent(String  s)
	{
		this();
		System.out.println("single arg  of  parent"+s);
	}
}

class child 
{
	child()
	{
		
		System.out.println("no arg const of child ");
	}
	
	child(String s)
	{
		super("welcome");
		System.out.println("single arg  of  child"+s);
	}	
}

	class test
	{
		public static void main(String[]  args )
		{
			child obj=new child("welcome");
											
		}
	}