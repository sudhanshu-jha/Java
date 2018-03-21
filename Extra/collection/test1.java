import java.util.*;
class niit{
int id;
String name;
String address;
	
	niit(int i,String s,String n){
	this.id=i;
	this.name=s;
	this.address=n;
	}
}

class test1{
	public static void main(String[] args){
	niit obj1=new niit (101,"Smridh","dwk");
	niit obj2=new niit (102,"meenal","dwk");
	niit obj3=new niit (103,"bedi","palam");

	ArrayList obj=new ArrayList();
	obj.add(obj1);
	obj.add(obj2);
	obj.add(obj3);
	
	System.out.println("Printing in forward direction");
	ListIterator li=obj.listIterator();
	while(li.hasNext()){
	niit n=(niit)li.next();
	System.out.println(n.id +" "+ n.name+"    "+ n.address);
	}
	

	System.out.println("Printing in backward direction");
	
	while(li.hasPrevious()){
	niit n=(niit)li.previous();
	System.out.println(n.id+"      "+n.name+"      "+n.address);
	}
	
	}
}