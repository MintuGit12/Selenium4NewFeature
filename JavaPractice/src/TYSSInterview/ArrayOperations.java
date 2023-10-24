package TYSSInterview;

public class ArrayOperations {
public static void interchange(int[] arr)
{
	for(int i=0;i<arr.length/2;i++)
	{
		int temp=arr[i];
		arr[i]=arr[arr.length-(i+1)];
		arr[arr.length-(i+1)]=temp;
		//System.out.println(arr[i]);
	}
	printArr(arr);
	printArr(bubbleSortArray(arr));
}
public static int[] bubbleSortArray(int[] arr)
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
	return arr;
}
public static int[] descArray(int[] arr)
{
	int[] arr1=new int[arr.length];
	int temp=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>temp)
		temp=arr[i];
	}
	return arr1;
	
}
public static void mergeAndSort(int[] a,int[] b)
{
	int[] arr=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		arr[i]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		arr[a.length+i]=b[i];
	}
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
public static void insertEleArray(int[] arr,int index,int num)
{
			arr[index]=num;
			printArr(arr);
}
public static void zigZagArray(int[] arr1,int[] arr2)
{int[] arr=new int[arr1.length+arr2.length];
int m=arr.length;
	if(arr1.length<arr2.length)
	{
		for(int i=0;i<arr1.length;i++)
		{
			arr[m++]=arr1[i];
			arr[m++]=arr2[i];
		}
		for(int j=arr1.length-1;j<arr2.length;j++)
		{
			arr[j]=arr2[j];
		}
	}
	printArr(arr);
}
public static void printArr(int[] arr)
{
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
	int[] arr= {123,23,43,1,234,90,88};
	interchange(arr);
	int arr1[]= {1,2,4,3,87,66,5};
	mergeAndSort(arr, arr1);
	insertEleArray(arr1, 4, 456);
	zigZagArray(arr1, arr);
	}

}
