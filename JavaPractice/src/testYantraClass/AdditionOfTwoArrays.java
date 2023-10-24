package testYantraClass;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		int[] ar1=FilteringArray.initArray();
		int[] ar2=FilteringArray.initArray();
		int ar3[];
		if(ar1.length>ar2.length)
		{
			ar3=new int[ar1.length];
		}
		else
		{
			ar3=new int[ar2.length];
		}
		
	try {
for(int i=0;i<ar1.length;i++)
{
	ar3[i]=ar1[i]+ar2[i];
}
	}
	catch(Exception e)
	{
		if(ar1.length<ar2.length)
		{
		for(int j=ar1.length-1;j<ar2.length;j++)
		{
			ar3[j]=ar2[j];
			}
		}
		else
		{
			for(int i=ar2.length-1;i<ar1.length;i++)
			{
				ar3[i]=ar1[i];
				}
		}
}
	for(int i:ar3)
		System.out.println(i);
}
}