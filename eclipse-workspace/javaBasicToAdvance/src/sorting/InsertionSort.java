package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {88,99,33,55,66,2,4,100};
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
//			finding of min index
			for(int j=i;j<n;j++) {
				if(arr[min]>arr[j])
					min=j;
			}
//			more efficient than BubbleSort because of less no. of swapping
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
			
		}
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);
	

	}

}
