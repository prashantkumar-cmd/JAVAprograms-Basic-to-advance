package multidimArray;

public class CopyArray {
	    public static void main(String[] args) {
	       
	        int [] numbers = {1, 2, 3, 4, 5, 6};
	        int [] positiveNumbers = numbers;    // copying arrays

	       // for (int num: positiveNumbers) {
	       //   System.out.print(num + ", ");
	       // }
	        for (int i=0; i<positiveNumbers.length; i++) {
	        	System.out.print(positiveNumbers[i] + " , ");
	        }
	    }
	}
