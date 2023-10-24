package StringProgramtestYantraClass;

import java.util.LinkedHashSet;

public class ToPrintPostitionOfEatchCharacterInRev {

	public static void main(String[] args) {
	String s="Tester";
	s=s.toLowerCase();
	LinkedHashSet<Character> lh=new LinkedHashSet<>();
for(int i=0;i<s.length();i++)
{
	lh.add(s.charAt(i));
}
for(char c:lh)
{
	for(int j=s.length()-1;j>=0;j--)
	{
		if(c==s.charAt(j))
		{
			System.out.println(c+"-->>>character at "+j);
			break;
		}
	}
}
	}

}
