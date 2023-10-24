package NumberProgramTestYantraClass;

public class MaxLengthOfAString {

	public static void main(String[] args) {
		String[] st= {"ram","shayam","ramesh","gopalanMall","gopalanMali","gopalanMail"};
		int update=0;
		String s=st[0];
		for(int i=1;i<st.length;i++)
		{
			if(s.length()<st[i].length())
			{
				s=st[i];
				update=s.length();
			}
		}
	//	System.out.println("largest size of string---->>>> "+s+" :is--->>"+s.length());
		for(String s1:st)
		{
			if(update==s1.length())
			{
				System.out.println(s1+"----->>>>>length --->>>"+update);
		}
		}
	}

}
