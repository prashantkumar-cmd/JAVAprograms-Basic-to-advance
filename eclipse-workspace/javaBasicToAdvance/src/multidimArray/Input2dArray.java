package multidimArray;

import java.util.Scanner;

public class Input2dArray {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the no. of rows 1st then columns");
		int rows=s1.nextInt();
		int cols=s1.nextInt();
		int arr[][]=new int[rows][cols];
		System.out.println("enter the elements of matrix one by one");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) {
				arr[i][j]=s1.nextInt();
			}
			
		}
		System.out.println("the matrices is");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}

}
