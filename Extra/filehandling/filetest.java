import java.io.*;
class filetest{
	public static void main(String[] args){
	try{
	FileOutputStream fs=new FileOutputStream("Myfirstfile.txt");
	String s="Hello User";
	byte[] b=s.getBytes();
	fs.write(b);
	fs.close();
	}catch(Exception e){
	e.printStackTrace();
	}
	}
}