package NumberProgramTestYantraClass;

import java.util.LinkedHashSet;

public class OccurenceOfEatchNumInArray {

	public static void main(String[] args) {
	int[] arr= {10,4,5,6,10,5,6,6,0,0,6};
LinkedHashSet<Integer> lh=new LinkedHashSet<>();
for(int i:arr)
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
	System.out.println(num+"--->>>>>"+count);
}
	}

}
