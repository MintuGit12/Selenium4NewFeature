package testYantraClass;

import java.util.Scanner;

public class MinimumSumAndMul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("initial value of array :");
		int[] ar=new int[sc.nextInt()];
		System.out.println("initialize the values :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					 int x = ar[i];
				ar[i]=ar[j];
				ar[j]=x;
			}
		}
		}
		for(int i1:ar)
			System.out.println(i1);
		
		int sum=0;
for(int i=0;i<3;i++)
{
	sum=sum+ar[i];
}
System.out.println("sum of three minimum number is :"+sum);

int mul=1;
for(int i=0;i<3;i++)
{
mul*=ar[i];
}
System.out.println("mul of 3 min number is :"+mul);
	}
	}
