package NumberProgramTestYantraClass;

public class PrimeNumberUpto100 {
public static boolean isPrime(int i)
{
	for(int j=2;j<=i/2;j++)
	{
		if(i%j==0)
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		int n=100;
		for(int j=2;j<=n;j++)
		{
			if(isPrime(j)==true)
				System.out.println(j+"-->>prime");
			

		}
	}

}
