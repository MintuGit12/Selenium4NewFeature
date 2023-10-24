package testYantraClass;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("initial value of array :");
		int[] ar=new int[sc.nextInt()];
		System.out.println("initialize the values :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("sorting....");
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int x=0;
				if(ar[i]>ar[j])
				{
					x=ar[i];
					ar[i]=ar[j];
					ar[j]=x;
				}
			}
		}
			for(int i:ar)
			System.out.print(i+"  ");
			System.out.println();
			System.out.println("decending order...................");
		for(int k=0;k<ar.length-1;k++)
		{
			for(int l=k+1;l<ar.length;l++)
			{
				int x=0;
			if(ar[k]<ar[l])
			{
				x=ar[k];
				ar[k]=ar[l];
				ar[l]=x;
			}
			}
		}
		for(int i:ar)
			System.out.print(i+"  ");
	}

}
