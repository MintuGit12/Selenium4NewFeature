package Recurssion;

import java.util.Scanner;

public class FactorialOfNum {
public static int fact(int num) {
if(num==1)
	return 1;
//int fact1=fact(num-1);
//int fac=num*fact1;
return num*fact(num-1);

}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num to find fact ");
		int num=sc.nextInt();
System.out.println(fact(num));

	}

}
