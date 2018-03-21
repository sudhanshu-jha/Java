class test<T>{
T code;
	test(T a){
	code=a;
	}
	void disp(){
	System.out.println("ur value is :"+code);
	}

public static void main(String[] args){
test<Integer>obj=new test<Integer>(667);
obj.disp();	
test<String>	
obj1=new test<String>("niit");
obj1.disp();	
}

}