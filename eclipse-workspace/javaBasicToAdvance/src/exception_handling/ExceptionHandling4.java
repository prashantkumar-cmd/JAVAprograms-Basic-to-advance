package exception_handling;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		//4: our throw our catch
		int x=4;
		int y=0;
		
		try {
		if(y==0)
		throw new ArithmeticException("you can not devide by zero");
		else
		System.out.println(x/y);
		}
		catch(ArithmeticException e) {
			System.out.println("exception is: "+e.getMessage());
		}
		finally {
			System.out.println("our catch our throw exception");
		}

	}

}
