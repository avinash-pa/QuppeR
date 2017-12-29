package test;

public class Test3 {

	public static int idxBinarySearch(int arr[], int low, int high) {
		
		if(high < low) 
			return 0;
		
		if(high == low)
			return low;
		
		int mid= (low+high)/2;
		
		if(mid<high && arr[mid+1] < arr[mid])
			return mid+1;
		
		if(mid>low && arr[mid-1]> arr[mid] )
			return mid;
		
		if(arr[high]>arr[mid])
			return idxBinarySearch(arr, low, mid-1);
		
		return idxBinarySearch(arr, mid+1, high);
	}
	public static void main(String[] args) {

		int arr[]= {15, 18, 2, 3, 6, 12};
		int n = arr.length;
		
		System.out.println("array rotated by : " + idxBinarySearch(arr,0,n-1));
		
	}

}
