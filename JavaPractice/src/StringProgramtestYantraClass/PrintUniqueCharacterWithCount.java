package StringProgramtestYantraClass;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintUniqueCharacterWithCount {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(13);
		ArrayList<Integer> al1=new ArrayList<>(al);
		//al1.addAll(al);
		System.out.println(al);
	/*Scanner sc=new Scanner(System.in);
	System.out.println("enter a String :");
	String s=sc.next();
	LinkedHashSet<Character> lh=new LinkedHashSet<>();
	for(int i=0;i<s.length();i++)
	{
		lh.add(s.charAt(i));
	}
	for(Character c:lh)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c.equals(s.charAt(i)))
				count++;
		}
		if(count==1)
		System.out.println(c+"----->>>>"+count);
	}*/
	}

}
