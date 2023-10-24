package testYantraClass;

import java.util.Scanner;

public class FirstandSecondMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("initial value of array :");
		int[] ar=new int[sc.nextInt()];
		System.out.println("initialize the values :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int max1=ar[0];
		int max2=ar[1];
		int max3=ar[2];
		for(int i=0;i<ar.length;i++)
		{
			if(max1<ar[i])
			{
				
				max3=max2;
				max2=max1;
				max1=ar[i];
				
			}
			else if(max2<ar[i])
			{
				max2=max1;
				max1=ar[i];
			}
			else if(max3<ar[i])
			{
				max3=ar[i];
		}
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
		System.out.println("sum of the three max :"+(max1+max2+max3));
	}

}
