import java.util.*;

class acct
{
	 int balAmt=1000;	
	public void deposit()
	{
	double amt,balAmt;
	 System.out.println("\n\n\n=====DEPOSIT AMOUNT=====");
	 System.out.print("Enter Amount you want to Deposit  : ");
	Scanner s=new Scanner(System.in);
	amt=s.nextDouble();
	balAmt=balAmt+amt;
	System.out.println("Balance Amount :  "+balAmt+"\n\n\n");
	}
	
	public void withdraw()
	{
	double amt,checkAmt,balAmt;
	 System.out.print("Enter Amount you want to Deposit  : ");
	Scanner s=new Scanner(System.in);
	amt=s.nextDouble();
	checkAmt=balAmt-amt;
	balAmt=checkAmt;
	System.out.println("Balance Amount :  "+balAmt+"\n\n\n");
	}
	
	
}
class bank1
{
    public static void main(String[] args)
    {
     
     int choice ,quit=0;
     choice=0;

       acct obj=new acct();
        System.out.println("\n=====WELLCOME TO BANK =====\n");
       
	do
	{
	Scanner s=new Scanner(System.in);
	System.out.println("\n\nChoose Your Choices ...");
        	System.out.println("1) Deposit...");
        	System.out.println("2) Withdraw...");
        	System.out.println("3) Quit");
         	System.out.print("Enter your choice :  ");
	choice=s.nextInt();
	
	switch(choice)
                           {
                             case 1 : //Deposit...
                                            obj.deposit();
                                           break;
                          
                            case 2 : //Withdraw...
                                            obj.withdraw();
                                            break;
                            case 3  : 
		System.out.println("\n\n.....Closing Current Account.....");
                                    break;
                            default : System.out.println("\nInvalid Choice \n\n");
                          }	



	}while(choice!=3);
	
        }

}