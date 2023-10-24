package TYSSInterview;

import java.util.Scanner;

public class PenagramTYss {
public static char[] anagram(String s1,String s2,boolean[] b,char[] ch)
{
	for(int i=0;i<s1.length();i++)
	{
		for(int j=0;j<s2.length();j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				if(b[j]==false)
				{
					ch[i]=s2.charAt(j);
					b[j]=true;
					break;
				}
			}
		}
	}
	return ch;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings to find anagram or not ");
		String s1 = sc.nextLine();
		String s2=sc.nextLine();
		char[] ch=new char[s2.length()];
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		s1=s1.trim();
		s2=s2.trim();
		boolean[] b=new boolean[s1.length()];
		ch=anagram(s1, s2, b, ch);
		for(char c:ch)
			System.out.print(c);
		System.out.println();
		String ss=new String(ch);
		if(ss.equals(s1))
			System.out.println("Penagram ");
		else
			System.out.println("not penagram");
	}

}
