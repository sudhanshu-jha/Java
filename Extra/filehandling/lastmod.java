import java.io.*;
import java.util.*;

public class lastmod {
   public static void main(String[] args) {
      File file = new File("filewrite");
      
      Long lastModified = file.lastModified();
      //Date date = new Date(lastModified);
      System.out.println(date);
   }
}