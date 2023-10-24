package NumberProgramTestYantraClass;

public class PalindromeNum {
public static boolean checkPalindrome(int num)
{
	int x=num;
	int num1=0;
	while(num!=0)
	{
		num1=num1*10+num%10;
		num=num/10;
	}
	return num1==x;
}
	public static void main(String[] args) {
	/*int num=929;
	int temp=num,num1=0;
	while(num!=0)
	{
		num1=num1*10+num%10;
		num=num/10;
	}
if(temp==num1)
	System.out.println("palindrome");
else
	System.out.println("not-palindrome");
//palindrome num from 100 to 1000
System.out.println("palindrome from 100 to 1000");
for(int i=1;i<=9;i++)
{
	for(int j=1;j<=9;j++)
	{
		System.out.print(i+""+j+""+i+" ");
	}
	System.out.println();
}
//num of dig in a number
int x=12340,count=0;
while(x!=0)
{
	x=x/10;
	count++;
}
System.out.println(count+"--->>>>dig in the number");
	*/
		if(checkPalindrome(122)==true)
			System.out.println("number is palindrome");
		else
			System.out.println("not palindrome");
	}

}
