import java.util.*;

abstract class Furniture{
static int price=0; 
}

class chair extends Furniture{
	Scanner s =new Scanner(System.in);
	
	public void booking(){
	System.out.println("Enter the number of bookself :");
	int num=s.nextInt();
	System.out.println("Entered number is :"+num);
	}
	
	public void price(){
	System.out.println("confirm the number of bookself");	
	int num1=s.nextInt();
	price =price*num1;
	System.out.println("price is="+num1);
	} 
	
}
class bookself implements Furniture{
	Scanner s =new Scanner(System.in);
	
	public void booking()
	{
	System.out.println("Enter the number of Furniture");
	int num=s.nextInt();
	System.out.println("Entered number is"+num);
	}
	
	public void price(){
	System.out.println("confirm the number of bookself");	
	int num1=s.nextInt();
	int price =price*num1;
	System.out.println("price is="+price);
	} 
	
}

class test3
{
	public static void main(String  args[]){
	System.out.println("Welcome");
	
	chair r =new Furniture();
	//bookself a=new Furniture(); 
	r.booking();
	r.price();
	}
	
}