class parent
{
	void p1()
	{
		System.out.println("p1 method of parent");
	}
}

class child extends parent
{
	void c1()
	{
		
		System.out.println("c1 method of child ");
	}	
}

	class test
	{
		public static void main(String[]  args )
		{
			child obj=new child();
			obj.c1();		// c1 method of child
			obj.p1();		// p1 method of parent
			
		}
	}