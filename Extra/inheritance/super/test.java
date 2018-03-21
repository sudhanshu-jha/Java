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
	
	void p1()
	{
		super.p1();
		System.out.println(" modified  p1 method of parent");
	}	
}

class test
	{
		public static void main(String[]  args )
		{
			child obj=new child();
			obj.c1();	
			obj.p1();		
				
			
		}
	}