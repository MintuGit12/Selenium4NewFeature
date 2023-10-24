package stringLogic;

public class StringRemoveDuplicate {

	public static void main(String[] args) {
		String st="AABCCBDFHHGH";
		String s="K";
		for(int i=0;i<st.length();i++)
		{
			int count=1;
			for(int j=0;j<s.length();j++)
			{
				if(st.charAt(i)==s.charAt(j))
					count++;
					
			}
			if(count>1)
				s=s+st.charAt(i);
		}
		System.out.println(s);
	}

}
