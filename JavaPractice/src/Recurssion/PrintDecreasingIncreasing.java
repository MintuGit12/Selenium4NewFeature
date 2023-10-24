package Recurssion;

public class PrintDecreasingIncreasing {
	static int sum=1;
public static int fact(int num)
{
	if(num>1)
	{
		sum=sum*(num);
		num--;
		System.out.println(sum+"--->>"+num);
		fact(num);
	}
	return sum;
}
	public static void main(String[] args) {
	System.out.println(fact(5));

	}

}
