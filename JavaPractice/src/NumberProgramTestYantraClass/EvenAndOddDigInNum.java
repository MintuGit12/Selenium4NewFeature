package NumberProgramTestYantraClass;

import java.util.Random;

public class EvenAndOddDigInNum {

	public static void main(String[] args) {
	int num=1234560,even=0,odd=0;
	while(num!=0)
	{
		if((num%10)%2==0)
{
	System.out.println(num%10+"-->>even digit :");
	even++;
}
		else
		{
			System.out.println(num%10+"-->>odd dig");
			odd++;
		}
		num=num/10;
	}
	//largest amont 3 num
	int x=299,y=234,z=1231;
	if(x>y&&x>z)
		System.out.println(x+" :is largest");
	else if(y>x&&y>z)
		System.out.println(y+" :is largest");
	else
		System.out.println(z+" :is largest");
	
	//factorial of a number
	int num1=5,fact=1;
	for(int i=num1;i>1;i--)
	{
		fact*=i;
	}
	System.out.println(fact+" :factorial of a number");
	}

}
