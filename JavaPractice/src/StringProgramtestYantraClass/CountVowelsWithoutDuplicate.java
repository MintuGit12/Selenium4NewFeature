package StringProgramtestYantraClass;

import java.util.LinkedHashSet;

public class CountVowelsWithoutDuplicate {

	public static void main(String[] args) {
		String s="India";
		s=s.toLowerCase();
		LinkedHashSet<Character> lh=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			lh.add(s.charAt(i));
		}
		for(char c:lh)
		{int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
				{
					if(c==s.charAt(j))
						count++;
				}
			}
			if(count==1)
			System.out.println(c+"---->>>"+count);
		}
		System.out.println("..................................");
		
		for(char c:lh)
		{
			int count=0;
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
						count++;
		}
			if(count==1)
			System.out.println(c+"---->>>"+count);
		}

	}
	}
