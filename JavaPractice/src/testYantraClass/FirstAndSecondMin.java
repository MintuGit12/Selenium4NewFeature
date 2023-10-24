package testYantraClass;

import java.util.Scanner;

public class FirstAndSecondMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("initial value of array :");
		int[] ar=new int[sc.nextInt()];
		System.out.println("initialize the values :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int min1=ar[0];
		int min2=ar[1];
		//5int min3=ar[2];
		for(int i=1;i<ar.length;i++)
		{
			if(min1>ar[i])
			{
				min2=min1;
				min1=ar[i];
			}
			else if(min2>ar[i])
				min2=ar[i];
			}
		System.out.println(min1);
		System.out.println(min2);
		System.out.println("first and second min sum :"+(min1+min2));
			}
	}

