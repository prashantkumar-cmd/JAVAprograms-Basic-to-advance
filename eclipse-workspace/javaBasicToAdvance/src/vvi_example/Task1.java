package vvi_example;

public class Task1 {
	int x=5,y=10;
	int s=x+y;
	static int z=7;
	//Task1 t=new Task1(); 
	public static void main(String[] args) {
		int x=8;// not static its local variable
		Task1 t=new Task1();
		System.out.println(t.s);
		System.out.println(x);
		System.out.println(z);
		System.out.println(Task1.z);
	}

}
