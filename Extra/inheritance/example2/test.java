import java.util.*;
class emp
{
	void e()
	{
	System.out.println("emp method");
	}
}
class mng extends emp
{
	void m()
	{
	System.out.println("mng method");
	}
}
class dir extends emp
{
	void d()
	{
	System.out.println("dir method");
	}
}

class exe
{
	void check(emp obj)
	{
	        if(obj instanceof mng)
	         {
	                 mng ob=(mng)obj;	
	                  ob.m();	
	         }
	     else if(obj instanceof  dir )
	        {
	             dir ob=(dir)obj;
	               ob.d();
	         }
	     else
	       {
	          obj.e();
	       }			
	
	}
}

class test
{
	public static void main(String[]  args)
	{
	emp obj=new dir();
	exe e= new exe();
	e.check(obj);
	}
}