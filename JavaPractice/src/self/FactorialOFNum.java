package self;

import java.util.Scanner;

public class FactorialOFNum {
	public static String primeNo()
	{
		System.out.println("enter to check number is prime or not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i!=0)
				continue;
			else
				return "number is not prime and System Kharab hai";	
		}
		return "number is prime Mauj kaato";
	}
	public static String palindrome()
	{
		System.out.println("Enter a number to check Palindrome or not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=0,num2=num;
		while(num!=0)
		{
			num1=num1*10+num%10;
			num=num/10;
		}
		if(num1==num2)
			return "number is palindrome";
		else
			return "System gandbad hai palindrome ka";
	}
public static String specialNumber()
{
	//Special number is the number that digit factorial sum =number ex. 145
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr a number to conform it is a special number or not");
int num1=sc.nextInt();
int nu=num1;
int nu1=nu;
int count=0;
	while(num1!=0)
	{
		num1=num1/10;
		count++;
	}
	int[] arr=new int[count];
	while(nu!=0)
	{
		int fac=1;
	int n=nu%10;
	for(int i=n;i>=1;i--)
	{
		fac=fac*i;
	}
	arr[count-1]=fac;
	count--;
	nu=nu/10;
	}
	int spec=0;
for(int i=0;i<arr.length;i++)
{
	spec+=arr[i];
}
if(spec==nu1)
	return nu1+" is a special number";
else
	return "System Kharb hai";
}
	public static void main(String[] args) {
	int num=6;
	int fact=1;

	for(int i=num;i>=1;i--)
	{
		fact=fact*i;
	}
	/*while(num!=1)
	{
		fact=fact*num;
		num--;
	}*/
	System.out.println("factorial of a number :"+fact);
//System.out.println(specialNumber());
//System.out.println(palindrome());
System.out.println(primeNo());
}
}
