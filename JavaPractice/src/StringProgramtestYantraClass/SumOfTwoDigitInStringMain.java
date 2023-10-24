package StringProgramtestYantraClass;

import java.util.Scanner;

public class SumOfTwoDigitInStringMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a alphanumeric string :");
		String s=sc.nextLine();
	int sum=0;int temp=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			temp=temp*10+(s.charAt(i)-48);
		}
		else
		{
			sum=sum+temp;
			temp=0;
		}
	}
	sum=sum+temp;
	System.out.println(sum);
	}

}
