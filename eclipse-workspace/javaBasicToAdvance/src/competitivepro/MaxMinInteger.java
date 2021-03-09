package competitivepro;

public class MaxMinInteger {
	

	public static void main(String[] args) {
		int[] n= {11,44,555,66,77,8,4000};
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i=0;i<n.length;i++) {
		  if(max<n[i] ) 
			  max=n[i];
		  else if( min>n[i])
			  min=n[i];
		  }
		System.out.println(max+"\n"+min);
		}
        
		
	}
