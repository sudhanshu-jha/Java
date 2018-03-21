import java.util.*;

abstract class furniture
{
static int total_amt = 0;

	abstract void price(int no);
}

class table extends furniture
{
	public void price(int no_tables)
	{
		int price=20*no_tables;
		System.out.println("Total price for tables is : "+price);
		total_amt= total_amt + price;
	}
}

class chair extends furniture
{
	
	public void price(int no_chairs)
	{
		int price=10*no_chairs;
		System.out.println("Total price for chairs is : "+price);
		total_amt= total_amt + price;
	}
}

class shelves extends furniture
{
	
	public void price(int no_shelves)
	{
		int price=20*no_shelves;
		System.out.println("Total price for shelves is : "+price);
		total_amt= total_amt + price;
	}
}

class book_shelf extends shelves
{	
	public void price(int no_book_shelf)
	{
		int price=40*no_book_shelf;
		System.out.println("Total price for book_shelves is : "+price);
	total_amt= total_amt + price;
	}
}

class Test1
{
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String choice;
		String to_buy;
		int no_chairs=0,no_tables=0,no_shelves=0,no_book_shelf=0;
		
		
		System.out.println("Chairs cost Rs 10"+"\n"+"Tables cost Rs 20"+"\n"+"Shelves cost Rs. 30"+"\n"+"book_shelf costs Rs 40");
		do
		{
			
			System.out.println("What do you want to buy : "+"\n"+"chairs"+"\n"+"tables"+"\n"+"shelves"+"\n"+"book_shelf");
			to_buy=s.next();
			
			if(to_buy.equals("chair"))
			{
				System.out.println("Enter the no of chairs you want to buy : ");
				no_chairs=s.nextInt();
				
				chair obj=new chair();
				obj.price(no_chairs);
			}
			
			else if(to_buy.equals("table"))
			{
				System.out.println("Enter the no of tables you want to buy : ");
				no_tables=s.nextInt();
				
				table obj=new table();
				obj.price(no_tables);
			}

			else if(to_buy.equals("shelves"))
			{
				System.out.println("Enter the no of shelves you want to buy : ");
				no_shelves=s.nextInt();
				
				shelves obj=new shelves();
				obj.price(no_shelves);
			}

			else if(to_buy.equals("book_shelf"))
			{
				System.out.println("Enter the no of book_shelves you want to buy : ");
				no_book_shelf=s.nextInt();
				
				book_shelf obj=new book_shelf();
				obj.price(no_book_shelf);
			}

			else
			System.out.println("wrong choice");

			System.out.println("Do you want to buy more : ");
			choice=s.next();
		
		}while(choice.equals("yes"));
		System.out.println("You have ordered "+"\n"+no_chairs +"chairs"+"\n"+no_tables+"tables"+"\n"+no_shelves+"shelves"+"\n"+no_book_shelf+"book_shelves");
		System.out.println("total amt is " + furniture.total_amt);
	}
}
