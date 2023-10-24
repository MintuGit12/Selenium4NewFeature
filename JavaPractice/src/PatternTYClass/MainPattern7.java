package PatternTYClass;

public class MainPattern7 {

	public static void main(String[] args) {
		int n=9;
	for(int i=1;i<=n;i++)
	{
		if(i<5)
		{
		for(int j=i;j<=n/2;j++)
			System.out.print(" ");
		for(int j=1;j<=i;j++)
			System.out.print("* ");
		System.out.println();
	}
		else 
		{
			for(int j=1;j<=i-(n/2+1);j++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print("* ");
			System.out.println();
		}

	}

	}
}
