package TYSSInterview;

import java.util.Scanner;

public class correctDateFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date format dd-mm-yy");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		if(dd<1||dd>31||mm<1||mm>12||yy<1)
			System.out.println("wrong date format");
		else if((mm==4||mm==6||mm==9||mm==11)&&dd>30)
			System.out.println("invalid date format");
		else if(mm==2&&dd>29)
			System.out.println("invalid date format");
		else if((yy%4==0&&yy%100!=0||yy%400==0)&&mm==2&&mm>28)
			System.out.println("invalid date format ");
		else
			System.out.println("correct date format ");
	}

}
