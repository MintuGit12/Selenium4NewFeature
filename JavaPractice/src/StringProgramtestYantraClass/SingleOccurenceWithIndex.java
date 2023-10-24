package StringProgramtestYantraClass;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SingleOccurenceWithIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=sc.nextLine();
		//String s="kolkata";
		LinkedHashSet<Character> lh=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			lh.add(s.charAt(i));
		}
		for(char c:lh)
		{
			
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(c==s.charAt(i))
					count++;
			}
			if(count==1)
			{
				int index=0;
				for(int i=0;i<s.length();i++)
				{
					if(c==s.charAt(i))
						index=i;
				}
				System.out.println(c+": is at only "+index+" index");
			}

	}
	}
}
