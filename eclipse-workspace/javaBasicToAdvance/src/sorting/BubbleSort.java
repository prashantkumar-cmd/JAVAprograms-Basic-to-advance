package sorting;

public class BubbleSort {

	public static void main(String[] args) {
   
    int arr[]= {66,99,88,77,22,44,9,-6};
    int n=arr.length;
    	for(int i=0;i<n-1;i++) {
    		
    		 boolean sorted=true;
    		 
    	  	for(int j=0;j<n-1-i;j++) {
    	  		
    	  		if(arr[j]>arr[j+1]) {
    	  			int temp=arr[j];
    	  			arr[j]=arr[j+1];
    	  			arr[j+1]=temp;
    	  			sorted=false;
    	  		}
    	  		
    	  		 
    	  	}
    	  	if(sorted==true)
  				break;
    	}
    	  
    	for(int i=0;i<n;i++) {
    	System.out.println(arr[i]);
    	  
       }
	}

}
