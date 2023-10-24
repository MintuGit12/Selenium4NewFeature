package StringProgramtestYantraClass;

import java.util.Scanner;

public class CountOfVowelsInAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
	//String s="I am from west bengal";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			System.out.print(s.charAt(i)+" ");
			count++;
		}
		else if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
		{
			System.out.print(s.charAt(i)+" ");
			count++;
		}
	}
	System.out.println();
	System.out.println(count);

	}

}
