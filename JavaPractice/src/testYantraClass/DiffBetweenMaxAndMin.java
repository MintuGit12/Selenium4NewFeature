package testYantraClass;

import java.util.Scanner;

public class DiffBetweenMaxAndMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("initial value of array :");
		int[] ar=new int[sc.nextInt()];
		System.out.println("initialize the values :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		//without bubble sort
		int max=ar[0];
		int min=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(max<ar[i])
				max=ar[i];
			if(min>ar[i])
				min=ar[i];
		}
		System.out.println("difference is :"+(max-min));
	}

}
