import java .util.*;
import java.io.*;

 class testappend
{
    public static void main( String[] args )
    {	
    	try{
    		//String data = " This content will append to the end of the file";
  		String data = " hello"; 
		  
	        System.out.println("Entering the string........");					
 
		
    		File file =new File("appendfile.txt");
 
    		
    		if(!file.exists()){
    		file.createNewFile();
    		}
 		
		
	        System.out.println("appending........");
 
    		
    	        FileWriter fileWritter = new FileWriter(file.getName(),true);
    	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
    	        bufferWritter.write(data);
    	        bufferWritter.close();
	
 
	        System.out.println("Done");
 
    	}catch(IOException e){
    		e.printStackTrace();
    	}
   }
}