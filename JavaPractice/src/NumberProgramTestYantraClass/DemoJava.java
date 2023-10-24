package NumberProgramTestYantraClass;

import java.util.LinkedHashSet;

public class DemoJava {

	public static void main(String[] args) {
			String s="wwwhttps";//o/p=w3h1t2p1s1
			LinkedHashSet<Character> lhs=new LinkedHashSet<>();
			for(int i=0;i<s.length();i++)
			{
				lhs.add(s.charAt(i));
			}
			for(Character c:lhs)
			{
				int count=0;
				for(int i=0;i<s.length();i++)
				{
					if(c.equals(s.charAt(i)))
					{
						count++;
					}
				}
				System.out.print(c+""+count);
			}
	}

}
