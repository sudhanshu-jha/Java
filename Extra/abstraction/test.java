import java.util.*;
abstract class oracle
{
       abstract  void java()
	{
	System.out.println(" oracle Java function");
	}
}
class niit extends oracle
{
    void java()
	{
	System.out.println("Java function");
	}

}

class test
{
	public static void main(String[] args)
	{
	oracle obj=new oracle();
	obj.niit();
	
	}
}

