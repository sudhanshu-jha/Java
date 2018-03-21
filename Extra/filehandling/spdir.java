import java.io.File;

public class spdir {
   public static void main(String[] args) 
   throws Exception {
      File file = null;
      File dir = new File("D:/");
      file = File.createTempFile("JavaTemp", ".javatemp", dir);
      System.out.println(file.getPath());
   }
}