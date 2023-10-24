package TYSSInterview;

public class BubbleSort {
public static void bSortMax(int[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	printArr(arr);
}
public static void bSortMin(int []arr)
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	printArr(arr);
}
public static void printArr(int[] a)
{
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		
		int[] arr= {100,23,45,43,5,678,43,0};
bSortMax(arr);	
bSortMin(arr);
	}

}
