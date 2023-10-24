package NumberProgramTestYantraClass;

import java.util.LinkedHashSet;

public class UniqueNumberInAnArray {

	public static void main(String[] args) {
	int[] arr= {0101,2340,43,22,11,234,56};
	for(int i=0;i<arr.length;i++)
	{
		int num=arr[i];
		int temp=num;
		String s=Integer.toString(num);
		char[] ch=s.toCharArray();
		LinkedHashSet<Character> lh=new LinkedHashSet<>();
		for(char c:ch)
		{
			lh.add(c);
		}
		//System.out.println(lh);
		//System.out.println(s+"---->>"+s.length());
		//System.out.println(lh+"--->>"+lh.size());
	if(ch.length==lh.size())
		System.out.println(temp+" :unique num");
	}
	}

}
