package testYantraClass;

import java.util.Scanner;

public class FilteringArray {
public static int[] initArray()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("initial value of array :");
	int[] ar=new int[sc.nextInt()];
	System.out.println("initialize the values :");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	return ar;
}
	public static void main(String[] args) {
		int[] ar=FilteringArray.initArray();
		int[] ar1=new int[ar.length];
	//by using one loop ascending
		int m=0;
		int n=ar.length-1;
		/*for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==1)
			{
				ar1[m]=ar[i];
				m++;
			}
			else
			{
				ar1[n]=ar[i];
				n--;
			}
		}*/
		//by using one loop decending
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				ar1[n]=ar[i];
				n--;
			}
			else
			{
				ar1[m]=ar[i];
				m++;
			}
		}
/*for(int i=0;i<ar.length;i++)
{
for(int j=i+1;j<ar.length;j++)
{
	if(ar[i]<ar[j])
	{
		int temp = ar[i];
	ar[i]=ar[j];
	ar[j]=temp;
	}
}
}*/
for(int i:ar1)
	System.out.println(i);
	}

}
