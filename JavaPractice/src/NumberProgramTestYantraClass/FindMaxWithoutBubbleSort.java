package NumberProgramTestYantraClass;

import java.util.HashSet;

public class FindMaxWithoutBubbleSort {

	public static void main(String[] args) {
	int[] ar= {0,10,2,3,442,442,34,67,87,76};
	int[] arr=new int[ar.length];
	for(int i=0;i<ar.length-1;i++)
	{
		for(int j=0;j<ar.length;j++)
		{
			if(ar)
		}
	}
	HashSet<Integer> hs=new HashSet<>();
	for(int i:ar)
	{
		hs.add(i);
	}
	int fmax=ar[0];
	int smax=ar[0];
	int tmax=ar[0];
for(int i:hs)
{
	if(fmax<i)
	{
		tmax=smax;
		smax=fmax;
		fmax=i;
	}
	else if(smax<i)
	{
			tmax=smax;
			smax=i;
	}
	else if(tmax<i)
		tmax=i;
}
System.out.println(fmax+">>>"+smax+">>>>>"+tmax);
	}

}
