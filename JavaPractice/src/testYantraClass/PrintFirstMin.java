package testYantraClass;

import java.util.Scanner;

public class PrintFirstMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("initial value of array :");
		int[] ar=new int[sc.nextInt()];
		System.out.println("initialize the values :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("first min num :");
		/*int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		System.out.println(min);*/
		int fmin=ar[0];
		int smin=ar[1];
		for(int k=0;k<ar.length;k++)
		{
			if(fmin>ar[k])
			{
				smin=fmin;
				fmin=ar[k];
				
			}
		}
		System.out.println("first and second min");
		System.out.println(fmin);
		System.out.println(smin);
	}

}
