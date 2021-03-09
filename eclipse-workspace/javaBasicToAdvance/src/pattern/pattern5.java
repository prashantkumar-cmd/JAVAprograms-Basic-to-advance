package pattern;

import java.util.Scanner;

public class pattern5 {
  
	public static void main(String[] args) {
		int k=1;
		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);
		int n = var.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(k +" ");
//				k++;
			}
			k++;
		 System.out.println();
		}

	}

}
