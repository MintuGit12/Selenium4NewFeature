package testYantraClass;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("initial length of array1 :");
		int[] ar1=new int[sc.nextInt()];
		System.out.println("initial length of array2 :");
		int[] ar2=new int[sc.nextInt()];
		System.out.println("initialize the values first array:");
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("initialize the values second array:");
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i]=sc.nextInt();
		}
int[] arr=new int[ar1.length+ar2.length];
for(int i=0;i<ar1.length;i++)
{
	arr[i]=ar1[i];
}
for(int i=ar1.length-1;i<ar2.length;i++)
{
	arr[i]=ar2[i];
}
for(int i:arr)
{
	System.out.println(i);
}
	}

}
