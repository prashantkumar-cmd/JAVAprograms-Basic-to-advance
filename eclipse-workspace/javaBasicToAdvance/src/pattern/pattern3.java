package pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		
			@SuppressWarnings("resource")
			Scanner var = new Scanner(System.in);
			int n = var.nextInt();
//			for(int i=n;i>=1;i--) {
//				for(int j=1;j<=i;j++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i+1;j++ ) {
				
			     System.out.print("* ");
				}
				System.out.println();
			}
			


	}

}
