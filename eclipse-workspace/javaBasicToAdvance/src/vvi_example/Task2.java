package vvi_example;

public class Task2 {

	public static void main(String[] args) {
		int x=5,y=5;
		String s="prashant";
		//System.out.print(x,y); can take single arg only
		System.out.printf("%d,%5d\n",x,y);
		System.out.printf("%5.2f\n",(float)y);
		System.out.printf("%05d,%d\n",x,y);
		System.out.printf("%15s\n",s);
		System.out.printf("%-15s%d",s,x);

	}

}
