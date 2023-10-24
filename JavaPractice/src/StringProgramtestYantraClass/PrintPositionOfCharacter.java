package StringProgramtestYantraClass;

import java.util.LinkedHashSet;

public class PrintPositionOfCharacter {

	public static void main(String[] args) {
		String s="kolkata";
		LinkedHashSet<Character> lh=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i)+" is at --->>"+(i+1));
		}
	//to print the position of char without duplicate
		System.out.println("to print the position of char without duplicate");
		for(int i=0;i<s.length();i++)
		{
		lh.add(s.charAt(i));	
		}
		for(char c:lh)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==c)
				{
					System.out.println(c+" first position is at ----->>"+j);
					break;
				}
			}
		}
	}

}
