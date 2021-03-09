package exception_handling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// default throw our catch
		int x=4;
		int y=0;
		
		try
		{
			int s=x/y;
			System.out.println("in try"+s);
		}
		catch(ArithmeticException e)
		{
		  System.out.println("exception found: "+e.getMessage());
		}
		finally {
			System.out.println("program continue..");
			
		}

	}

}
