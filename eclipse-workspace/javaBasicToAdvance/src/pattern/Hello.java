package pattern;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		System.out.println("enter a value");
 @SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
		System.out.println("hello "+n);
	}

}
