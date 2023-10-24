package StringProgramtestYantraClass;

import java.util.LinkedHashSet;

public class ToRemoveDuplicateWordInAString {

	public static void main(String[] args) {
	String s="I am from sdet 42 batch i am sdet 42";
	s=s.toLowerCase();
	String[] s1=s.split(" ");
	LinkedHashSet<String> lh=new LinkedHashSet<>();
	for(int i=0;i<s1.length;i++)
	{
		if(lh.add(s1[i])==true)
			System.out.print(s1[i]+" ");
	}
	System.out.println();
//to print only the duplicate in the string
	for(int i=0;i<s1.length;i++)
	{
		if(lh.add(s1[i])==true)
		{
			break;
		}
		else
			System.out.print(s1[i]+" ");
	}
	}

}
