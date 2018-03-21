class test1<T>{
T code;
	test1(T  a){
	code=a;
	}
	
	void disp{
	System.out.println("ur value is :"+code);
	}

	public static void main(String[] args){
	test1<Integer>obj=new test1<Integer>(647);
	obj.disp();
	}
}