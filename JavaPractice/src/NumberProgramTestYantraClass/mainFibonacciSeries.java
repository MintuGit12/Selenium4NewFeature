package NumberProgramTestYantraClass;

public class mainFibonacciSeries {

	public static void main(String[] args) {
		System.out.println("fib series");
		//0 1 1 2 3 5 8 13
		int i1=0,i2=0,fib=1;
		int m=10;
		while(m!=0)
		{
			System.out.print(fib+" ");
			i1=i2;
			i2=fib;
			fib=i1+i2;
			m--;
		}
	}

}
