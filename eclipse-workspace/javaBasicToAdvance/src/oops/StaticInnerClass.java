package oops;
class CPU1{
	 String prashant;
	 static class Processor{
		 void show(){
			
			 System.out.println("this is inner class");
		 }
	   }
	      void show() {
	    	  
		System.out.println("this is outer class");
		
	  }
  }


public class StaticInnerClass {
	public static void main(String[] args) {
		//
		//object creation for static inner class
		
		CPU1.Processor obj1= new CPU1.Processor();
		obj1.show();
		CPU1 obj2=new CPU1();
		obj2.show();
	
	 	}

}
