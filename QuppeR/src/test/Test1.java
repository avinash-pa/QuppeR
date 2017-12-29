package test;

public class Test1 {
	
	
	public static void sort(int arr[],int low, int high)
	{
		int n=high;
		int temp=0;
		if(low<high) {
			
			for(int i=1; i<n;i++)
			{	
			if(arr[n-i]>arr[n-1]) {
				temp=arr[n-i+1];
				arr[n-i+1]=arr[n-i];
				arr[n-i]=temp;
			}	
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {14, 22, 11, 2, 25, 99, 51, 20};
		int n=arr.length;
		
		sort(arr,0,n);
		System.out.println("array sorted is :");

		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
