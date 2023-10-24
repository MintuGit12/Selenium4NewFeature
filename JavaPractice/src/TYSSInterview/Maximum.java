package TYSSInterview;

public class Maximum {
public static void max(int[] arr)
{
	int fMax=arr[0];
	int sMax=arr[1];
	int tMax=arr[2];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>fMax)
		{
			tMax=sMax;
			sMax=fMax;
			fMax=arr[i];
		}
		else if(arr[i]>sMax)
		{
			tMax=sMax;
			sMax=arr[i];
		}
		else if(arr[i]>tMax)
		{
			tMax=arr[i];
		}
	}
	System.out.println(fMax +" first Max");
	System.out.println(sMax +" Second Max");
	System.out.println(tMax +" third Max");
}
public static void bubbleShortMax(int[] arr)
{
	int temp=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(temp>arr[i])
		{
			int temp1=arr[i];
			arr[i]=temp;
			temp=temp1;
		}
	}
	printArr(arr);
}
public static void printArr(int []arr)
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"  ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		int[] arr= {123,23,345,65,78,9,2,45,21,3,8};
		max(arr);
		bubbleShortMax(arr);
	}

}
