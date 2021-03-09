package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
public class Example3 {

	public static void main(String[] args) throws IOException
	{
		int i;
		FileInputStream fin=new FileInputStream("C:/Users/prashant singh/Desktop/java/filecreated.txt");
       do {
    	 i=fin.read();
    	 if(i!=-1) {
    		 System.out.println((char)i);
    	 }
       }while(i!=-1);
     fin.close(); 
	}

}