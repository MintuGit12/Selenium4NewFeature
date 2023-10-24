package StringProgramtestYantraClass;

import java.util.Scanner;

public class SumOfDigInString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number string :");
	String st=sc.next();
	int sum=0;
	for(int i=0;i<st.length();i++)
	{
		char c=st.charAt(i);
		 if(c>='0'&&c<='9')
		 {
			 int i1=(int)c-48;
			 System.out.print(i1+" ");
			 sum+=i1;
		 } 
	}
	System.out.println();
	System.out.println(sum);

	}

}
