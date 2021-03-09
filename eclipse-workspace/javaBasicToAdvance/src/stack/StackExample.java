package stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack num=new Stack();
		
		num.push(10);
		num.push(4);
		num.peak();
		num.push(6);
	    num.show();
	    int m=num.pop();
	    
	    System.out.println("poped element is " + m);
	    // or System.out.println("poped element is " + num.pop());
	    num.show();
	    num.peak();
	    
	}

}
