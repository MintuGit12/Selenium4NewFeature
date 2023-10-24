package TYSSInterview;

import java.util.Scanner;

public class PracticeNumber {
public static void evenOdd(int[] num)
{
	for(int i=0;i<num.length;i++)
	{
		if(num[i]%2==0)
			System.out.println(num[i]+"-->>even");
		else
			System.out.println(num[i]+"--->>odd");
	}
}
public static void shortArr(int[] arr)
{
	int[] ar=new int[arr.length];
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<ar.length;j++)
	{
	if(arr[i]>arr[i+1])
	{
		ar[j]=arr[i+1];
		System.out.println(ar[j]);
	}
	else {
		ar[j]=ar[i];
		System.out.println(ar[j]);
	}
//System.out.println(arr[i]);
	}
	//printArr(ar);
}
}
public static void  printArr(int[] ar) {
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
	System.out.println();
}
public static int[] initArray()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the array length :");
int len=sc.nextInt();
int[] arr=new int[len];
System.out.println("initialize the array :");
for(int i=0;i<len;i++)
{
	arr[i]=sc.nextInt();
}
return arr;
}
	public static void main(String[] args) {
	int[] arr=initArray();
	//evenOdd(arr);
	printArr(arr);
	}

}
