package PatternTYClass;

public class NumPattern2 {

	public static void main(String[] args) {
		int n=4;
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>i;j--)
			System.out.print(" ");
		for(int j=1;j<=i;j++)
			System.out.print(i+" ");
		System.out.println();
	}
System.out.println("next pattern---------->>>>>>>>>>>>");
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
		System.out.print(" ");
	for(int j=i;j<=n;j++)
		System.out.print(i+" ");
	System.out.println();
}
System.out.println("next pattern---------->>>>>>>>>>>>");
for(int i=1;i<=n;i++)
{
	if(i%2==0)
	{
	for(int j=1;j<=i;j++)
		System.out.print("2 ");
	}
	else
	{
		for(int j=1;j<=i;j++)
			System.out.print("1 ");	
	}
	System.out.println();
}
System.out.println("next pattern---------->>>>>>>>>>>>");
int m=0;
for(int i=1;i<=n+1;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(m+" ");
	}
	m=m+2;
	System.out.println();
}
System.out.println("next pattern---------->>>>>>>>>>>>");
m=5;
for(int i=1;i<=m;i++)
{
	int l=5;
for(int j=1;j<=i;j++)
	System.out.print((l--)+" ");
System.out.println();
}
System.out.println("next pattern---------->>>>>>>>>>>>");
m=5;
int k=1; 
for(int i=1;i<=m;i++)
{

		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k++;
			if(k>9)
			{
				k=1;
			}
		
		}
		System.out.println();


}
	}

}
