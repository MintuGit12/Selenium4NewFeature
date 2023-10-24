package TYSSInterview;

public class SmallestAndLargestDig {
	public static void arrSmallLar(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			smallLargest(arr[i]);
		}
	}
public static void smallLargest(int num)
{
	int num1=num;
	int lar=0;
	int small=num%10;
	while(num!=0)
	{
		int x=num%10;
		if(x>lar)
			lar=x;
		if(x<small)
			small=x;
		num=num/10;
	}
	System.out.println(small+" smallest dig in  "+num1);
	System.out.println(lar+"  largest dig  "+num1);
}
	public static void main(String[] args) {
	//smallLargest(125476);
		int[] arr= {123,2345,234,234,76,890,657};
arrSmallLar(arr);
	}

}
