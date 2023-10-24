package TYSSInterview;

import java.util.Scanner;

public class ArrayLogicTyss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number from 1-5");
		int num=sc.nextInt();
		int[] arr= {10,20,30,40,50};
		int[] arr1=new int[arr.length];
		int m=0;
		for(int i=num;i<arr.length;i++)
		{
			arr1[m]=arr[i];
			m++;
		}
		for(int i=0;i<num;i++)
		{
			arr1[m]=arr[i];
			if(m==arr.length-1)
				break;
			else
				m++;
		}
		for(int i:arr1)
			System.out.print(i+" ");
	}

}
