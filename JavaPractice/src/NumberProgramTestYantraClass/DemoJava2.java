package NumberProgramTestYantraClass;

public class DemoJava2 {

	public static void main(String[] args) {
String s="AAbACCCdEEA";
int n=s.length();
while(n!=0)
{
	int count=1;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==s.charAt(i+1))
		count++;
	else
		break;
}
System.out.println(count);
n--;
	}
	}
}
