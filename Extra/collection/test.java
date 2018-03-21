import java.util.*;

class test{

	public static void main(String[] args){
	set<Integer>a1=new Hashset(Integer);
	a1.add(23);
	a1.add(21);
	a1.add(78);
	a1.add(78);

	Iterator i =a1.iterator();
	
	while(i.hasNext()){
	System.out.println(i.next());
	}

	}
}