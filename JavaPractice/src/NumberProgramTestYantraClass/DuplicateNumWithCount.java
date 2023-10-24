package NumberProgramTestYantraClass;

import java.util.LinkedHashSet;

public class DuplicateNumWithCount {

	public static void main(String[] args) {
		//int[] arr= {1,7,9,10,4,5,6,10,5,6,6,0,0,6};
		String str="Akhil is here";
		LinkedHashSet<Character> lh=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			lh.add(str.charAt(i));
		}
		for(Character c:lh)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(c==str.charAt(i))
					count++;
			}
			System.out.println(c+"------>>>>>>"+count);
		}
	/*	for(int i:arr)
		{
			lh.add(i);
		}
		for(int num:lh)
		{
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(num==arr[i])
					count++;
			}
			if(count>1)
			System.out.println(num+"--->>>>>"+count);
		}*/
		
	}

}
