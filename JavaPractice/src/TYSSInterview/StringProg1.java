package TYSSInterview;

public class StringProg1 {

	public static void main(String[] args) {
	String s="AAbACCCdEEA";//A2S
int num=s.length();

	for(int i=1;i<s.length();i++)
	{int count=1;
		if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)!=s.charAt(i-1)||s.charAt(i)==s.charAt(i-1) && s.charAt(i)!=s.charAt(i-1))
		{
			int j=i;
			int k=i+1;
			for(int l=j;l<k;l++)
			{
				count++;
			}
		}
		else
			System.out.println(count);
	}


	}

}
