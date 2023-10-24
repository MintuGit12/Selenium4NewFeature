package NumberProgramTestYantraClass;

import java.util.LinkedHashSet;

public class PositionOfEatchNoWithDuplicate {

	public static void main(String[] args) {
		int[] arr= {10,4,5,6,10,5,6,6,0,0,6};
	
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
			System.out.println(arr[i]+"--->>>>"+i);
				
			}
System.out.println("position without dupicate :");
LinkedHashSet<Integer> lh=new LinkedHashSet<>();
for(int i:arr)
{
	lh.add(i);
}
for(int num:lh)
{
for(int i=0;i<arr.length;i++)
{
	if(num==arr[i])
	{
		System.out.println(num+"--->>>>"+i);
		break;
	}
}
}
System.out.println("dupicate with count :");
for(int num:lh)
{
	int cont=0;
for(int i=0;i<arr.length;i++)
{
	if(num==arr[i])
	{
		cont++;
	}
}
if(cont>1)
	System.out.println(num+"----->>>>>>"+cont);
}

}}