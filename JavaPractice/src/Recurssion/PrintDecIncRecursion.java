package Recurssion;

import java.util.Scanner;

public class PrintDecIncRecursion {
public static void incDec(int num)
{
	if(num==0)
	{
		return;
	}
	System.out.println(num);
		incDec(num-1);
	System.out.println(num);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter upto which you want to print :");
		int num=sc.nextInt();
		incDec(num);
	}

}
