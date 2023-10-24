package TYSSInterview;

public class PrimeAndStrongNumber {
public static void strongNum(int[] ar)
{
for(int i=0;i<ar.length;i++)
{
	int num=ar[i];
int factSum=0;
while(num!=0)
{
	factSum+=fact(num%10);
	num=num/10;
}
if(factSum==ar[i])
	System.out.println(ar[i]+"strong number");
else {
	System.out.println(ar[i]+"not a strong number");
}
}
}
public static int fact(int num)
{
	int fact=1;
	while(num>0)
	{
		fact*=num;
		num--;
	}
	//System.out.println(fact);
	return fact;
}
	public static void main(String[] args) {
	int[] ar= {123,145,32,34};
strongNum(ar);
	}

}
