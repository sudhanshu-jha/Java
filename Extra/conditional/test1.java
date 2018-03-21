import java.util.*;
class test1{
int grade=0;
void check(){
Scanner s=new Scanner(System.in);
System.out.print(" Enter the grade---->");
grade=s.nextInt();
	
switch (grade){
case 1:
System.out.println(" 100 schlr");
break;	
case 2:
System.out.println(" 90schlr");	
break;		
case 3:
System.out.println("80 schlr");	
break;	
case 4:
System.out.println(" 70schlr");	
break;		
default :
System.out.println("no schlr");			
}
}
public static void main(String[] args){
test1 obj=new test1();
obj.check();
}	
	
}