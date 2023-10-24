package StringProgramtestYantraClass;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {
String s="i am from kolkata west bengal";
String[] st=s.split(" ");

	/*String s1=st[0];
	st[0]=st[(st.length)-1];
	st[(st.length)-1]=s1;*/
	
for(String s2:st)
{
	System.out.print(s2+" ");
}
System.out.println();
System.out.println("swapping all para----->>>>>>>>>");
for(int i=0;i<st.length/2;i++)
{
	for(int j=st.length-1;j>=st.length/2;j--)
	{
		String temp=st[i];
		st[i]=st[j];
		st[j]=temp;
	}
}
for(String s4:st)
	System.out.print(s4+" ");
	}
	}

