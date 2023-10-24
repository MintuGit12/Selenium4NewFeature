package PatternTYClass;

public class Anagram {
public static char[] sortChar(char[] ch)
{
	for(int i=0;i<ch.length-1;i++)
	{
		if(ch[i]>ch[i+1])
		{
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
	}
	return ch;
	
}
	public static void main(String[] args) {
		String s1="aab";
		String s2="bba";
		if(s1.length()!=s2.length())
			System.out.println("not anagram");
		else
		{
			char[] c1=s1.toCharArray();
			c1=sortChar(c1);
			System.out.println(c1);
			char[] c2=s2.toCharArray();
			c2=sortChar(c2);
			System.out.println(c2);
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]!=c2[i])
				{
					System.out.println("not anagram");
					break;
				}
			}
			//System.out.println("anagram.........");
		}

	}

}
