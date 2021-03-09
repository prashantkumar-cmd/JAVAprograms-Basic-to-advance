package filehandling;
import java.io.*;
public class Example2 {

	public static void main(String[] args) throws IOException
	{
		int i;
		FileOutputStream fout=new FileOutputStream("C:/Users/prashant singh/Desktop/java/filecreated.txt",true);
       String s="TATA";
       char ch[]=s.toCharArray();
       for(i=0;i<s.length();i++) {
    	  fout.write(ch[i]);
       }
     fout.close(); 

	}

}
