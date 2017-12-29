package test;

public class Reverse {

	
	public static void reverse(int arr[],int low, int high) {
		
		while(high>low) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low]= temp;
			low++;
			high--;
		}
	}
	
	public static void printArray(int arr[], int n) {
		
		System.out.print("the array is : ");
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]);
			System.out.print(",");
			
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 3 ,4,6,66,5,10};
		int n = arr.length;
		printArray(arr,n);
		reverse(arr,0,n-1);
		System.out.println("");
		printArray(arr,n);
	}

}
