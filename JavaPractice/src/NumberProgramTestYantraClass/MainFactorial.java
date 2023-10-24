package NumberProgramTestYantraClass;

public class MainFactorial {

	public static void main(String[] args) {
	int num=32;
	int fact=1;
	for(int i=num;i>=2;i--)
	{
		fact*=i;
	}
	System.out.println(fact);
	}

}
