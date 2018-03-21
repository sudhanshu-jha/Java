import java.util.*;

 class Employee {
	
	 int empId;
	 
	void Employee(){
	System.out.println("no arg constructor");
	}
	
	public void setEmpId(){
	this.empId=empId;
	Scanner s =new Scanner(System.in);
	System.out.print("Enter Employee id");	
	empId=s.nextInt();
	System.out.println("setting empId"+empId);	
	}

	public  void getEmpId (){
	System.out.println("---------------Displaying---------");
	System.out.print("Employee  id is :" +empId);
	}

	
}
class Employeet{
public static void main(String[]  args){
	Employee emp=new Employee();
	emp.setEmpId();
	emp.getEmpId();
	}
}
