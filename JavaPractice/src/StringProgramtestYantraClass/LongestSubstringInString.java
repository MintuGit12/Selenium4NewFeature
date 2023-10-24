package StringProgramtestYantraClass;

import java.util.LinkedHashSet;

public class LongestSubstringInString {
	public static boolean checkDuplicate(String st)
	{
		char[] ch=st.toCharArray();
		LinkedHashSet<Character> lh=new LinkedHashSet<>();
		for(char c:ch)
			lh.add(c);
if(st.length()!=lh.size())
	return false;
return true;
	}
public static String subStrMain(String st)
{
	st=st.toLowerCase();
	String s="";
	for(int i=0;i<st.length()-1;i++)
	{
		if(st.charAt(i)!=st.charAt(i+1))
		{
			s=s+st.charAt(i);
			if(checkDuplicate(s)==false)
			{
				return s.substring(0, s.length()-1);	
			}
		
		}
		else 
			return s;
	}
	return s;	
}
	public static void main(String[] args) {
	String s=subStrMain("My name is khan and i am a terrorist");	
	System.out.println(s);
	}

}
