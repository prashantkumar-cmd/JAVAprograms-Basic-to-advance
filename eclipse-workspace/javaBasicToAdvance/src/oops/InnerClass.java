package oops;
 class Cpu{
	 String prashant;
	 class Processor{
		 
		 void show(){
			 
			
			 
			 System.out.println("this is inner class");
		 }
	 }
	 void show() {
		System.out.println("this is outer class");
		
	 }
 }
 

public class InnerClass {
	public static void main(String []args) {
		
	Cpu obj1=new Cpu();
	//object creation for non static nested class
	Cpu.Processor obj2=obj1.new Processor();
	
	obj2.show();
	
	obj1.show();
	}
	
	
}
