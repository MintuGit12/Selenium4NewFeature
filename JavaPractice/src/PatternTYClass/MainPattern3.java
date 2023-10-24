package PatternTYClass;

public class MainPattern3 {

	public static void main(String[] args) {
		int n=7/2;
		for(int i=1;i<=n+1;i++)
		{
			for(int j=i;j<=n;j++)
				System.out.print(" ");
			for(int k=1;k<(i+i);k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("now differnt");
		int m=5;
		for(int i=1;i<=m;i++)
		{
			for(int j=i;j<m;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			System.out.print("* ");
			System.out.println();
		}

	}

}
