package NumberProgramTestYantraClass;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1,fib=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("how many fib series you want :");
		int count=sc.nextInt();
	System.out.print(num1+" "+num2+" ");
	for(int i=2;i<=count;i++)
	{
		fib=num1+num2;
		System.out.print(fib+" ");
		num1=num2;
		num2=fib;
	}
	}

}
