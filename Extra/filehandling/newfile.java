import java.io.*;

public class newfile {
   public static void main(String[] args) {
      try{
         File file = new File("C:\Users\Sudhanshu\Desktop\new\filehandling\myfile.txt");
         if(file.createNewFile())
         System.out.println("Success!");
         else
         System.out.println
         ("Error, file already exists.");
     }
     catch(IOException ioe) {
        ioe.printStackTrace();
     }
   }
}