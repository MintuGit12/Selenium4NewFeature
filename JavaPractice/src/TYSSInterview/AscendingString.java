package TYSSInterview;

public class AscendingString {

	public static void main(String[] args) {
	String[] st= {"adashr","adarsh","shayam","shamay","raman","roman"};
	for(int i=0;i<st.length-1;i++)
	{
		
		for(int j=0;j<st[i].length();j++)
		{
			if(j==st[i].length()-1||j==st[i+1].length()-1)
			{
				break;
			}
			else if(st[i].charAt(j)>st[i+1].charAt(j))
			{
				
				String ss=st[i];
				st[i]=st[i+1];
				st[i+1]=ss;
			}
			else if(st[i].charAt(j)==st[i+1].charAt(j))
				continue;
		}
	}
	for(String s:st)
		System.out.println(s);
	}

}
