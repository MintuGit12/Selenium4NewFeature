package TYSSInterview;

public class Exception1 extends Exception {
public static int m1()
{
	try {
	int i=10/0;
	return 567;
	}
catch (Exception e) {
e.printStackTrace();
System.out.println(e.toString());
System.out.println(e.getMessage());
}
	finally {
		System.out.println("hiii");
	}
	return 234;
}
	public static void main(String[] args)throws Exception1 {
System.out.println(m1());
		throw new ArithmeticException("/by zero");
		//throw new Exception1();
	}

}
