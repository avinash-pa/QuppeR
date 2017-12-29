package test;

class Test2 {
	
	public static int index(int arr[], int n) 
	{
		int min_index=0, min=arr[0];
		
		for(int i=0;i<n;i++) {
			
			if(min > arr[i]) {
				min = arr[i];
				min_index = i;
			}
		}
	
		return min_index;
	}

	public static void main(String[] args) {
		
		int arr[] = {12,14,14,15,16,18,1};
		int n = arr.length;


		 if(index(arr,n)==0) {
			 System.out.println("could not recognise array rotated or not...");
		 }
		 else{
			 System.out.println("array rotated by : " + index(arr,n));			 
		 }
	}

}
