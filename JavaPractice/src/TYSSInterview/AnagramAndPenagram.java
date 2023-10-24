package TYSSInterview;

import java.util.Scanner;

public class AnagramAndPenagram {
	public static String removeSpace(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				continue;
			else
				s1=s1+s.charAt(i);
		}
		return s1;
		
	}
public static String sortString(String s)
{
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]>ch[j])
			{
				char c=ch[i];
				ch[i]=ch[j];
				ch[j]=c;
			}
		}
	}
	return new String(ch);
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two strings to find anagram or not ");
	String s1 = sc.nextLine();
	String s2=sc.nextLine();
	s1=removeSpace(s1).toLowerCase();
	s2=removeSpace(s2).toLowerCase();
	if(s1.length()==s2.length())
	{
		s1=sortString(s1);
		s2=sortString(s2);
		boolean b=true;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				b=false;
				break;
			}
		}
		if(b==false)
			System.out.println("not anagram");
		else
			System.out.println("both are anagram");
		
	}
	else
		System.out.println("not anagram");
	}
}
