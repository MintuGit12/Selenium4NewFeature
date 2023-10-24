package testYantraClass;

import java.util.Scanner;

public class MinWithoutBubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("initial value of array :");
		int[] ar=new int[sc.nextInt()];
		System.out.println("initialize the values :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
	int min=ar[0];
	for(int i=1;i<ar.length;i++)
	{
		if(min>ar[i])
			min=ar[i];
	}
System.out.println(min);

int max=ar[0];
for(int i=1;i<ar.length;i++)
{
	if(max<ar[i])
		max=ar[i];
}
System.out.println(max);

System.out.println("3 min using one for");
int min1=ar[0];
int min2=ar[1];
int min3=ar[2];
for(int i=1;i<ar.length;i++)
{
	if(min1>ar[i])
	{
		int temp=min1;
		min3=min2;
		min2=min1;
		min1=ar[i];
		//ar[i]=temp;
	}
}
	System.out.println(min2);
	}

}
