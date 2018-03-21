import java.io.*;
import java.io.IOException;
import java.util.Date;

class file{
	void  file_compare (){
      	File file1 = new File("C:/File/demo1.txt");
      	File file2 = new File("C:/java/demo1.txt");
      	if(file1.compareTo(file2) == 0) {
         	System.out.println("Both paths are same!");
      	} else {
         	System.out.println("Paths are not same!");
      	}
	}
	
	void file_new()  {
      	try{
         	File file = new File("D:/myfile.txt");
         	if(file.createNewFile())
         	System.out.println("Success!");
         	else
         	System.out.println("Error, file already exists.");
     	}
     	catch(IOException ioe) {
        	ioe.printStackTrace();
        	}
	}


      	 void file_lastmodified(){
      	File file = new File("myfile.txt");
     	 Long lastModified = file.lastModified();
      	Date date = new Date(lastModified);
      	System.out.println(date);
   	}

	/*void file_spdir(){
     	throws Exception {
     	 File file = null;
      	File dir = new File("D:/");
      	file = File.createTempFile("JavaTemp", ".javatemp", dir);
	System.out.println(file.getPath());
   	}
	}*/

	void file_exist() {
  	File file = new File("D:/java.txt");
    	System.out.println(file.exists());
	}
	
	void file_sizeinbytes {
  	 public static long getFileSize("filetest.java") {
     	 File file = new File("filetest.java");
      	if (!file.exists() || !file.isFile()) {
       	  System.out.println("File doesn\'t exist");
         	return -1;
      	}
      	return file.length();
   	}
   	 long size = getFileSize("filetest.java");
     	 System.out.println("Filesize in bytes: " + size);
   	}
	}
	
}

/*

void file_readonly {
   public static void main(String[] args) {
      File file = new File("C:/java.txt");
      System.out.println(file.setReadOnly());
      System.out.println(file.canWrite());
   }
}

void  file_rename {
   
      File oldName = new File("C:/program.txt");
      File newName = new File("C:/java.txt");
      if(oldName.renameTo(newName)) {
         System.out.println("renamed");
      } else {
         System.out.println("Error");
      }  
}


void file_sizeinbytes {
   public static long getFileSize(String filename) {
      File file = new File(filename);
      if (!file.exists() || !file.isFile()) {
         System.out.println("File doesn\'t exist");
         return -1;
      }
      return file.length();
   }
   public static void main(String[] args) {
      long size = getFileSize("c:/java.txt");
      System.out.println("Filesize in bytes: " + size);
   }
}


import java.io.File;
import java.util.Date;

public class file_cglmdtime {
   public static void main(String[] args) 
   throws Exception {
      File fileToChange = new File
      ("C:/myjavafile.txt");
      fileToChange.createNewFile();
      Date filetime = new Date
      (fileToChange.lastModified());
      System.out.println(filetime.toString());
      System.out.println
      (fileToChange.setLastModified
      (System.currentTimeMillis()));
      filetime = new Date
      (fileToChange.lastModified());
      System.out.println(filetime.toString());
   }
}

import java.io.*;

public class file_temp {
   public static void main(String[] args) 
   throws Exception {
      File temp = File.createTempFile
      ("pattern", ".suffix");
      temp.deleteOnExit();
      BufferedWriter out = new BufferedWriter
      (new FileWriter(temp));
      out.write("aString");
      System.out.println("temporary file created:");
      out.close();
   }
}

import java.io.*;

public class file_strextfile {
   public static void main(String[] args) throws Exception {
      try {
         BufferedWriter out = new BufferedWriter
         (new FileWriter("filename"));
         out.write("aString1\n");
         out.close();
         out = new BufferedWriter(new FileWriter
         ("filename",true));
         out.write("aString2");
         out.close();
         BufferedReader in = new BufferedReader
         (new FileReader("filename"));
         String str;
         while ((str = in.readLine()) != null) {
            System.out.println(str);
         }
      }
      in.close();
      catch (IOException e) {
         System.out.println("exception occoured"+ e);
      }
   }
}


import java.io.*;

public class file_cpyother {
   public static void main(String[] args) 
   throws Exception {
      BufferedWriter out1 = new BufferedWriter
      (new FileWriter("srcfile"));
      out1.write("string to be copied\n");
      out1.close();
      InputStream in = new FileInputStream
      (new File("srcfile"));
      OutputStream out = new FileOutputStream
      (new File("destnfile"));
      byte[] buf = new byte[1024];
      int len;
      while ((len = in.read(buf)) > 0) {
         out.write(buf, 0, len);
      }
      in.close();
      out.close();
      BufferedReader in1 = new BufferedReader
      (new FileReader("destnfile"));
      String str;
      while ((str = in1.readLine()) != null) {
         System.out.println(str);
      }
      in.close();
   }
}


import java.io.*;

public class file_del {
   public static void main(String[] args)  {
      try {
         BufferedWriter out = new BufferedWriter
         (new FileWriter("filename"));
         out.write("aString1\n");
         out.close();
         boolean success = (new File
         ("filename")).delete();
         if (success) {
            System.out.println("The file has 
            been successfully deleted"); 
         }
         BufferedReader in = new BufferedReader
         (new FileReader("filename"));
         String str;
         while ((str = in.readLine()) != null) {
            System.out.println(str);
         }
         in.close();
         }
         catch (IOException e) {
            System.out.println("exception occoured"+ e);
            System.out.println("File does not exist 
            or you are trying to read a file that 
            has been deleted");
         }
      }
   }
}


import java.io.*;

public class file_read {
   public static void main(String[] args)  {
      try {
         BufferedReader in = new BufferedReader
         (new FileReader("c:\\filename"));
         String str;
         while ((str = in.readLine()) != null) {
            System.out.println(str);
         }
         System.out.println(str);
         }
         catch (IOException e) {
         }
      }
   }
}


import java.io.*;

public class file_write {
   public static void main(String[] args)  {
      try {
         BufferedWriter out = new 
         BufferedWriter(new FileWriter("outfilename"));
         out.write("aString");
         out.close();
         System.out.println
         ("File created successfully");
      }
      catch (IOException e) {   e.printStackTrace;
      }
   }
}*/

class filetest{
public static void main(String[] args){
file obj =new file();
obj.file_new();
obj.file_compare();
obj.file_lastmodified();
//obj.file_spdir();
obj.file_exist(); 
obj.file_sizeinbytes();
}
}






