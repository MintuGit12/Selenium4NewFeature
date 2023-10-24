package StringProgramtestYantraClass;

import java.util.LinkedHashSet;

public class OccurenceOfEatchWord {

	public static void main(String[] args) {
	String s="I am from sdet 42 batch i am sdet";
	s=s.toLowerCase();
String[] st=s.split(" ");
LinkedHashSet<String > lh=new LinkedHashSet<>();
for(int i=0;i<st.length;i++)
{
	lh.add(st[i]);
}
for(String ss:lh)
{
	int count=0;
	for(int j=0;j<st.length;j++)
	{
		if(ss.equals(st[j]))
			count++;
	}
	System.out.println(ss+"-->> is occured "+count);
}
	}

}
