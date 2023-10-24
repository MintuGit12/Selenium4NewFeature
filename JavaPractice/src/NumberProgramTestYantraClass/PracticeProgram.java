package NumberProgramTestYantraClass;

public class PracticeProgram {
	public static void bubbleShort(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		printArr(ar);
	}
	public static void printArr(int[] arr)
	{
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
public static void main(String[] args) {
	int[] ar= {11,23,45,3,3,0,234,176,90,7}; 
	bubbleShort(ar);
}
}
