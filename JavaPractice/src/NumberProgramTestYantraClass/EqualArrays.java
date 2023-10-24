package NumberProgramTestYantraClass;

public class EqualArrays {
public static int[] arrShort(int[] ar1)
{
	for(int i=0;i<ar1.length;i++)
	{
		
	}
	return ar1;
}
	public static void main(String[] args) {
	int[] ar1= {10,20,30,40,60};
	ar1=arrShort(ar1);
	int[] ar2= {10,30,20,40,60};
	boolean status=true;
	if(ar1.length==ar2.length)
	{
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]!=ar2[i])
				status=false;
		}
	}
	else
		status=false;
	System.out.println(status);
	if(status==true)
		System.out.println("arrays are equal :");
	else
		System.out.println("arrays are not equal :");
	}

}
