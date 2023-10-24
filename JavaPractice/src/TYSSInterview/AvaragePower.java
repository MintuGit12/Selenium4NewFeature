package TYSSInterview;

public class AvaragePower {
public static void avg(int num)
{
	int num1=num;
	int count =0;
	int sum=0;
	while(num!=0)
	{
		sum+=num%10;
		count++;
		num=num/10;
	}
	System.out.println(sum/count+"  is the avarage of the number ");
}
public static void isDiserium(int num)
{
	
}
	public static void main(String[] args) {
	avg(123);

	}

}
