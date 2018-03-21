class parent
{
	void p1()
	{
		System.out.println("p1 method of parent");
	}
	
	void p2()
	{
		System.out.println("p2 method of parent");
	}
}

class child extends parent
{
	void p1()
	{
		
		System.out.println("overidden  p1");
	}
	
	void c1()
	{
		System.out.println("c1 method of child");
	}	
}

	class test
	{
		public static void main(String[]  args )
		{
			child obj=new child();
			obj.p1();
			obj.p2();		
			obj.c1();				
		}
	}