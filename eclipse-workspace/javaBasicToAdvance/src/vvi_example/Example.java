package vvi_example;

public class Example {
	
	
	static int count(int n) {
		
		if(n>0) {
			count(n-1);
			 int temp=n;  
		    if(temp==n)
		    System.out.print(temp+" ");
			
	    }
	return 0;
    }

	public static void main(String[] args) {
	
		count(5);

	}

}
