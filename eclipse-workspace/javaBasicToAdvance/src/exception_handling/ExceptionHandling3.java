package exception_handling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// our throw default catch
		int x=4;
		int y=0;
		
		if(y==0)
		throw new ArithmeticException("you can not devide by zero");
		else
		System.out.println(x/y);

	}

}
