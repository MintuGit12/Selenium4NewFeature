package StringProgramtestYantraClass;

import java.util.LinkedHashSet;

public class PositionOfEatchWord {

	public static void main(String[] args) {
	String st="i am from sdet 42 batch from i sdet";
	String[] str=st.split(" ");
	for(int i=0;i<str.length;i++)
	{
		System.out.print(str[i]+"----position is --->>>"+(i+1));
		System.out.println();
	}
	//without duplicate
	System.out.println("without duplicate.......>>>>>>>");
	LinkedHashSet<String> lh=new LinkedHashSet<>();
	for(int i=0;i<str.length;i++)
	{
		lh.add(str[i]);
	}
	for(String s:lh)
	{
		for(int j=0;j<str.length;j++)
		{
			if(s.equals(str[j]))
			{
				System.out.println(str[j]+"----->>>>"+(j+1));
				break;
		}
		}
	}
	}

}
