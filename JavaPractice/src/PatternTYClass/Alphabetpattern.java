package PatternTYClass;

public class Alphabetpattern {

	public static void main(String[] args) {

		System.out.println("next pattern---------->>>>>>>>>>>>");
		int m=5;
		int a=97;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			System.out.print(((char)a++)+" ");
			System.out.println();
		}
		System.out.println("next pattern---------->>>>>>>>>>>>");
		a=65;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			System.out.print(((char)a++)+" ");
			System.out.println();
		}

	}

}
