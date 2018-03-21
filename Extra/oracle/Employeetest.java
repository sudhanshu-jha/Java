import java.util.*;
 class Employee{
	public int emp_id;
	public String emp_name;
	public String emp_ssn;
	public double emp_sal;

	void Employee(int emp_id,String emp_name,String emp_ssn,double emp_sal){
	this.emp_id=emp_id;
	this.emp_name=emp_name;
	this.emp_ssn=emp_ssn;
	this.emp_sal=emp_sal;
	}
			 
} 

/*  class Manager extends Employee{
	public int emp_id;
	public String emp_name;
	public String emp_ssn;
	public double emp_sal;
	//private String deptname;
	
	public Manager(int emp_id,String emp_name,String emp_ssn,double emp_sal){
	//super.Employee();
	//super(emp_id,emp_name,emp_ssn,emp_sal);
	super.emp_id=emp_id;
	super.emp_name=emp_name;
	super.emp_ssn=emp_ssn;
	super.emp_sal=emp_sal;
	
	//this.deptname=deptname;
	}
		/* 
		public string getdeptname(){
		return deptname;
	} 
} */


 class Employeetest{ 
   	public static void main(String args[]){
	Employee emp=new Employee(101,"John Smith","011-22-3467",120345.27);
	// Manager mng=new Manager(101,"John Smith","011-22-3467",120345.27);
	 System.out.println("\t\tWECLOME !!!!! \n");
	//emp.setemp_id(101);
	System.out.println("Employee id :"+ emp.getemp_id());
	//emp.setemp_name("John Smith");
	System.out.println("Employee name :"+ emp.getemp_name());
	//emp.setemp_ssn("011-22-3467");
	System.out.println(emp.getemp_name()+"s'"+" soc sec # :"+ emp.getemp_ssn());
	//emp.setemp_sal(120345.27);	
	System.out.println(emp.getemp_name()+"s'"+" salary :"+ emp.getemp_sal()); 
	}
}
