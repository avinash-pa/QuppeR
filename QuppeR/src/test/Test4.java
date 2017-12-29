package test;

public class Test4 {

	public static void alter(int arr[], int n) {
		
		int i = -1, temp = 0;
		
		for(int j = 0;j < n;j++) {
			
			if(arr[j] < 0) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int pos = i+1, neg = 0;
		 
		while(pos < n && neg<pos && arr[neg] < 0 )
		{
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			 
			pos++;
			
			neg += 2;
			
		}
		
		System.out.println("the required array is : " );
		for(int p=0;p<n;p++) {
			System.out.print(arr[p]);
		}
		
	}
	
	 	
	
	
	public static void main(String[] args) {
		int arr[]= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int n=arr.length;
		
		System.out.println("the array formed is:");
		alter(arr,n);
	}
}
