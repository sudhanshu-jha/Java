import java.util.*;

class test1{

void a(){
try{
int a=8/0;
}
catch (Exception e){
System.out.println(e.getMessage());
e.printStackTrace();
System.out.println(e);
}
}

void b(){
a();
}

void c(){
b();
}

public static void main(String[] args){
test1 obj=new test1();
obj.c();
}

}