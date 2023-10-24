package TYSSInterview;

import java.util.Scanner;

public class PassedFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int b=sc.nextInt();
if(p>=35&&c>=35&&m>=35&&b>=35)
	System.out.println("student is passed ");
else
	System.out.println("student failed ");
	}

}
