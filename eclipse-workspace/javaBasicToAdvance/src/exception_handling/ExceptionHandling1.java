package exception_handling;
import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		//default throw default catch
		int x,y,z;
		Scanner s =new Scanner(System.in);
		 x=s.nextInt();
		 y=s.nextInt();
		 
		 z=x/y;
		 System.out.println(z);
		 System.out.println("hello");
		 s.close();
		}
	}
