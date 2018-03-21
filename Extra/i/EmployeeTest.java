package Emp;
import java.text.NumberFormat;

import java.util.*;

 class Employee 
{


    private int empId;
 
   private String name;

    private String ssn;

    private double salary;


    public Employee(int empId, String name, String ssn, double salary) {
 
       this.empId = empId;

    this.name = name;

        this.ssn = ssn;
   
     this.salary = salary;

    }


    public int getEmpId() {

        return empId;
  
  }


    public String getName() {
 
       return name;
   
 }


    public String getSsn() {

        return ssn;
 
   }


    public double getSalary() {

        return salary;
 
   }

 
   public void setName(String name) {

        // Make sure the name value is not null or empty
   
     if (name != null && !name.equals("")) 
{

            this.name = name;
  
      }

    }


    public void raiseSalary(double increase) {
 
       // Make sure the increase is not less than 0
   
     if (increase > 0)
 {
    
        salary += increase;

 
       }
 
   }

}


 class Manager extends Employee 
{

    private String deptName;


    public Manager(int empId, String name, String ssn, double salary, String deptName)
 {
    
    super(empId, name, ssn, salary);
   
     this.deptName = deptName;
 
   }

   
 public String getDeptName() {
   
     return deptName;

    }

}

 class Director extends Manager
 {


    private double budget;


    public Director(int empId, String name, String ssn, double salary, String department, double budget) 
{
 
       super(empId, name, ssn, salary, department);
   
     this.budget = budget;

    }


    public double getBudget()
 {
      
  return budget;
  
  }

}

 class Admin extends Employee 
{


    public Admin(int empId, String name, String ssn, double salary) 
{
   
     super(empId, name, ssn, salary);
   
 }

}

 class Engineer extends Employee {


    public Engineer(int empId, String name, String ssn, double salary) {
  
      super(empId, name, ssn, salary);
 
   }

}

public class EmployeeTest
 {


    public static void main(String[] args)
 {


        // Create the classes as per the practice

        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
    

        Manager mgr = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");

   
     Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);

 
       Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

   
     // Print information about the objects you created
   
     printEmployee(eng);
  
      printEmployee(adm);
  
      printEmployee(mgr);
 
       printEmployee(dir);


        System.out.println("\nTesting raiseSalary and setName on Manager:");

        mgr.setName ("Barbara Johnson-Smythe");

        mgr.raiseSalary(10_000.00);

        printEmployee(mgr);


    }

   
 public static void printEmployee(Employee emp)
 {
  
      System.out.println(); // Print a blank line as a separator
  
      // Print out the data in this Employee object

        System.out.println("Employee id:         " + emp.getEmpId());
  
      System.out.println("Employee name:       " + emp.getName());
  
      System.out.println("Employee Soc Sec #:  " + emp.getSsn());
   
     System.out.println("Employee salary:     " + NumberFormat.getCurrencyInstance().format((double) emp.getSalary()));

    }

}