package StringProgramtestYantraClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class OccurenceOfEatchCharacter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string :");
	String st=sc.next();
	LinkedHashSet<Character> hs=new LinkedHashSet<>();
	for(int i=0;i<st.length();i++)
	{
		hs.add(st.charAt(i));
	}
	for(Character c:hs)
	{
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(c.equals(st.charAt(i)))
				count++;
		}
		//System.out.println(c+"---->>>>"+count);
		//System.out.println(".................");
		if(count>1)
			System.out.println(c+"------>>>>>>duplicate..."+count);
	}
	}

}
