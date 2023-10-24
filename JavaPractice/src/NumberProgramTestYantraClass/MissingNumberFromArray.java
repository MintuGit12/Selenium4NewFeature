package NumberProgramTestYantraClass;

public class MissingNumberFromArray {
protected void name1() {
	System.out.println("Hiii");
}
	public static void main(String[] args) {
	int[] ar= {10,20,30,35,45,78,55,65,35,55,65};
//bubble sort
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]>ar[j])
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	//remove duplicate
	System.out.println("remove duplicate...................");
	int[] arr=new int[ar.length];
	int m=0;
	for(int i=0;i<ar.length-1;i++)
	{
		if(ar[i]!=ar[i+1])
		{
		arr[m]=ar[i];
		m++;
		}
	}
	arr[m]=ar[ar.length-1];
	for(int x:arr)
		System.out.println(x+" ");
//finding missing number :
	for(int i=0;i<arr.length-1;i++)
	{
		if(ar[i]+1!=ar[i+1])
		{
			for(int j=ar[i]+1;j<ar[i+1];j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(".......>>>>>> is missing");
	}
	}
}
}
