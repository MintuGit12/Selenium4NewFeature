package practice;

public class MaximumLengthInStringArrayTYTest {

	public static void main(String[] args) {
		String[] st= {"Ram","shayam","vinit","purusottam","purusottam"};
		String s=st[0];
		int max=s.length();
		for(int i=1;i<st.length;i++)
		{
			if(s.length()<st[i].length())
			{
				s=st[i];
				max=s.length();
			}
		}
		for(String ss:st)
		{
			if(max==ss.length())
				System.out.println(s+"-->>is the largest String");
		}
		
	}

}
