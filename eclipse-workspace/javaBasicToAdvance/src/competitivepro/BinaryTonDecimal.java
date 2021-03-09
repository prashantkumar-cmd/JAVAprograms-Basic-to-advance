package competitivepro;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTonDecimal {
	
		static void generatePrintBinary(int n)
		{
			
			Queue<String> q = new LinkedList<String>();

			q.add("1");
			
			while (n-- > 0) {
				
				String s1 = q.peek();
				q.remove();
				System.out.println(s1);

				// Store s1 before changing it 
				String s2 = s1;
				q.add(s1 + "0");

				
				q.add(s2 + "1");
			}
			//clear all remaining elements
			
			q.clear();
			
		}

		public static void main(String[] args)
		{
			int n = 10;
			generatePrintBinary(n);
		}
	}
	



