package oops;
//polymorphism is of 2 type:run time(achieved by method overriding) &compile time(operator+method overloading)
//method overriding is achieved by abstraction :example abs.java
class Demo{
	//method overloading
	public void display() {
		System.out.println("this is example of method overload");
	}
	public void display(int n) {
		System.out.println("entered value is  "+n);
	}
}

public class Polymor extends Demo {
	void show() {
		//operator overloading
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("this is example of operator overloading the sum is \n"+sum);
		String s1="prashant";
		String s2="singh";
		String name=s1+s2;
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		Polymor obj=new Polymor();
		obj.display();
		obj.display(100);
		obj.show();
	 	

	}

}
