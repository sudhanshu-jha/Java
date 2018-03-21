import java.io.*;
import java.util.*;
class filecheck{
	public static void main (String[] args){
	try{
	File f=new File("Myfirstfile.txt");
	
	if(f.exists()){
	System.out.println("File Found");
	}
	else{
	System.out.println("File not Found");
	}
	
	System.out.println(f.length());
	System.out.println(f.delete());
	
	}//try end
	catch(Exception  e){
	e.printStackTrace();
	}//catch end
	
	}//main end
	
	
}//class end