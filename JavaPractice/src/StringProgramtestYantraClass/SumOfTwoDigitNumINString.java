package StringProgramtestYantraClass;

public class SumOfTwoDigitNumINString {

	public static void main(String[] args) {
	String st="av3232bce233fd3";
	char[] ch=st.toCharArray();
	int sum=0;
	for(int i=1;i<ch.length-1;i++)
	{
		String st1="";
		if((ch[i-1]>='a'&&ch[i-1]<='z'))
		{
		int m=i;
		while(ch[i]>='0'&&ch[i]<='9')
		{
			st1+=ch[i];
			i++;
		}
		for(int j=0;j<st1.length();j++)
		{
		sum=sum*10+(int)st1.charAt(j)-48;
		System.out.println(sum);
		}
		}

	}
	
	}
	}
