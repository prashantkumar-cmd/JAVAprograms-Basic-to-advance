package oops;

public class Constructor {
	      private int x;

		   // constructor
		   private  Constructor(){
		       System.out.println("Constructor Called");
		       x = 5;
		   }

		   public static void main(String[] args){
		       // constructor is called while creating object
		       Constructor obj = new Constructor();
		     
		       System.out.println("Value of x = " + obj.x);
		   }
		

}
