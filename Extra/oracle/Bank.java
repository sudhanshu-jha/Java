import java.util.*;

public class Bank{

int amount=0;
	 void deposit(int obj){
	System.out.println("deposit method called");
	System.out.println("Enter the amount to be deposited");
	Scanner s=new Scanner(System.in);
	int damt=s.nextInt();
	 amount+=damt;
	System.out.println("Amount is---->"+amount);
	}
	
	void withdraw(){
	System.out.println("withdraw method called");
	System.out.print("Enter the amount to withdraw");
	Scanner s=new Scanner(System.in);
	int wamt=s.nextInt();
	int amount =amount-wamt;
	System.out.println("Amount is---->"+amount);
	}
	
	public static void main(String[] args){
	Bank obj=new Bank();
	
	System.out.println("Enter 1 to deposit 2 to withdraw");
	Scanner s =new Scanner(System.in);
	int choice=s.nextInt();
		if (choice==1){
		obj.deposit(100);
		}
		else{
		obj.withdraw();
		}
	}
}

