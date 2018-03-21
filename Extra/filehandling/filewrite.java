import java .util.*;
import java.io.*;
class filewrite{
	public static void main(String[] args){
	try{
	FileInputStream fs=new FileInputStream("Myfirstfile.txt");
	int i;
	while((i=fs.read())!=-1){
	System.out.println(i);
	System.out.println((char)i);
	
	 FileWriter fileWritter = new FileWriter(file.getName(),true);
    	 BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
    	 bufferWritter.write(data);
    	 bufferWritter.close();
	
 
	
	}
	}catch(Exception e){
	e.printStackTrace();
	}
}