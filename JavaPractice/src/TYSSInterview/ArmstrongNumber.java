package TYSSInterview;

public class ArmstrongNumber {
public static void armstrong(int[] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		int count=0;
		int num=ar[i];
		int num1=ar[i];
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		int arm1=0;
		while(num1!=0)
		{
			arm1=arm1+arm(count,num1%10);
			num1=num1/10;
		}
		if(arm1==ar[i])
			System.out.println(ar[i]+"  armstrong number");
		else
			System.out.println(ar[i]+"  not a armstrong number");
		
	}
}
public static int arm(int count,int number)
{
	int mul=1;
	for(int i=1;i<=count;i++)
	{
		mul*=number;
	}
	return mul;
}
	public static void main(String[] args) {
	int[] arr= {12,123,23,153,1534};
	armstrong(arr);
	}

}
