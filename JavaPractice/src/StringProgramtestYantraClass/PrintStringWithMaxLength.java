package StringProgramtestYantraClass;

import java.util.Scanner;

public class PrintStringWithMaxLength {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a para");
	String st=sc.nextLine();
	String[] st1=st.split(" ");
	int max=st1[0].length();
	int min=st1[0].length();
	for(int i=1;i<st1.length;i++)
	{
		if(max<st1[i].length())
			max=st1[i].length();
		else if(min>st1[i].length())
			min=st1[i].length();
	}
for(String ss:st1)
{
	if(max==ss.length())
		System.out.println(ss+"--is the max size string of size --->>"+max);
	
	if(min==ss.length())
		System.out.println(ss+"--is the min size string of size --->>"+min);
}


//to print vowel or consonent
for(int i=0;i<st.length();i++)
{
	if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
		System.out.println(st.charAt(i)+"-->>its a vowel");
	else if(st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U')
		System.out.println(st.charAt(i)+"-->>its a vowel");
	else if(st.charAt(i)==' ')
		continue;
	else
		System.out.println(st.charAt(i)+"-->>its a consonent");
}
	}

}
