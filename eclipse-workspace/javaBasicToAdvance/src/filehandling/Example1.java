package filehandling;
import java.io.File;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException
	
	{
     File f1=new File("C:/Users/prashant singh/Desktop/java/filecreated.txt");
     f1.createNewFile();
     System.out.println("file exist  "+f1.exists());
     System.out.println(f1.canWrite());
     System.out.println(f1.canRead());
     System.out.println(f1.length()+"  "+
     f1.getName());
     //f1.delete(); it will delete the file
     
     
	}

}
