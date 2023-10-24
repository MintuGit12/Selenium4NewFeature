package StringProgramtestYantraClass;

public class ReverseAGivenSentence {

	public static void main(String[] args) {
	String s=" I am from sdet 42 ";
	String[] st=s.split(" ");
	for(int i=st.length-1;i>=0;i--)
	{
		System.out.print(st[i]+" ");
	}
	
	//without string function
	String st1="";
	for(int j=0;j<s.length();j++)
	{
		if(s.charAt(j-1)==' '&&s.charAt(j+1)==' ')
		{
			st1=st1+s.charAt(j);
		}
	}
	System.out.println(st1);
	}

}
