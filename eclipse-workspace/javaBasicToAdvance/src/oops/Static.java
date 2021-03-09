package oops;


	class Animal {
		 static int leg=4;
		 public static void displayInfo() {
		   System.out.println("I am an animal");
		 }
		 public static void man() {
			 System.out.println("i m man");
		 }
		}
	class cow extends Animal{
	  
	
		 // leg=5;
	  
		//fun hiding
		public static void displayInfo() {
			System.out.println("i am cow in india i am treated as mother");
		}
		//public void man() {
		//	System.out.println("i am boy");
		//}
		
	}

	public class Static {
		 public static void main(String[] args) {
			 //cow obj=new cow();
			// obj.man();
			 cow.man(); //static fun are inherited
			 
			// Animal obj2=new Animal();
			// obj2.man();
			 
		   Animal.displayInfo();
		   cow.displayInfo();
		   //static mem variable are inherited
		   
		  System.out.println(cow.leg);
		 }
		}


