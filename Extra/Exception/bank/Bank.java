import java.util.*;

public class Bank{
	int a=100;
	int tamt=0;
	int amt=0;
	 void deposit(){
	System.out.println("deposit method called");
	System.out.println("Enter the amount to be deposited");
	Scanner s=new Scanner(System.in);
	int damt=s.nextInt();
	int tamt=amt+damt;
	System.out.println("Amount after deposit---->"+tamt);
	}
	
	void withdraw(){
	System.out.println("withdraw method called");
	System.out.println("Enter the amount to withdraw");
	Scanner s=new Scanner(System.in);
	int wamt=s.nextInt();
	this.deposit();
	int namt=tamt-wamt;
	System.out.println("Amount ofter withdrawl---->"+namt);
	}
	
	public static void main(String[] args){
	Bank obj=new Bank();
	//System.out.println("Enter 1 to deposit 2 to withdraw");
	//Scanner s =new Scanner(System.in);
	//int choice=s.nextInt();
	//	if (choice==1){
		obj.deposit();
	//	}
	//	else if(choice==2){
		obj.withdraw();
	//	}
	//	else{
	//	System.out.println("Invalid choice");	
	//	}
	}
}

