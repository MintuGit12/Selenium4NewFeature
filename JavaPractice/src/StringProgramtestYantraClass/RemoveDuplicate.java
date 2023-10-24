package StringProgramtestYantraClass;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
	String s="Kannada";
	char[] ch=s.toCharArray();
	LinkedHashSet<Character> hs=new LinkedHashSet<>();
for(int i=0;i<s.length();i++)
{
hs.add(s.charAt(i));
}
for(Character c:hs)
System.out.print(c);
System.out.println();

String s1="";
int len=ch.length-1;
for(int i=0;i<ch.length-1;i++)
{
	while(len>=0)
	{
		if(ch[i]==ch[len])
		{
		continue;
		}
		else
			System.out.print(ch[i]);
	}
}
System.out.println(s1);
	}

}
