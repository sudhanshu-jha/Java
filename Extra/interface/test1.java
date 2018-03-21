import java.util.*;

interface RBI{
void rate_of_int();
void rate_of_tax();
}

class SBI implements RBI{
public void rate_of_int(){
System.out.println("12 %");
}

public void rate_of_tax(){
System.out.println("10 %");
}
}

class PNB implements RBI{
public void rate_of_int(){
System.out.println("12 %");
}
public void rate_of_tax(){
System.out.println("15 %");
}
}
class Test1{
public static void main(String[]  args){
RBI r =new PNB();
r. rate_of_int();
r.rate_of_tax();
}
}