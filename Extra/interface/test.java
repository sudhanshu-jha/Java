import java.util.*;
interface P1{
void disp();
}
interface P2 {
  void disp();
}
class C1 implements P2  {
public void disp(){
System.out.println("c1 method");
}
}
class test{
public static void main(String[]  args){
C1 r=new C1();
r.disp();
}
}