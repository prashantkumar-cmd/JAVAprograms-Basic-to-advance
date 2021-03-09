package competitivepro;

import java.math.BigInteger;

public class HighIntPow {
	
	public static void main(String[] args) {
  BigInteger p=new BigInteger("2").pow(1000);

  BigInteger sum=new BigInteger("0");
	
  BigInteger ten=new BigInteger("10");
   
   while(p.compareTo(BigInteger.ZERO)==1 ) {
	   sum=sum.add(p.remainder(ten));
	   p=p.divide(ten);
   }
        
      System.out.println(sum);
	}

}
