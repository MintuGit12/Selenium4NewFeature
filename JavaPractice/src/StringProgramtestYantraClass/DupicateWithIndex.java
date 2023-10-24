package StringProgramtestYantraClass;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class DupicateWithIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=sc.nextLine();
		LinkedHashSet<Character> lh=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			lh.add(s.charAt(i));
		}
		for(char c:lh)
		{
			
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(c==s.charAt(i))
					count++;
			}
			if(count>1)
			{
				int m=0;
				int[] ar=new int[count];
				for(int i=0;i<s.length();i++)
				{
					if(c==s.charAt(i))
					{
						ar[m]=i;
						m++;
					}
				}
				for(int j:ar)
					System.out.println(c+":is at.....>>>"+(j+1)+": index");
			}
		
		}
	}

}
