package StringProgramtestYantraClass;

import java.util.Scanner;

public class SegrigateAlphabetNumSpecialChar {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String st = sc.nextLine();
String st1="";
String st2="";
String st3="";
for(int i=0;i<st.length();i++)
{
	char c=st.charAt(i);
	if(c>='a'&&c<='z'||c>='A'&&c<='Z')
		st1+=c;
	else if(c>='0'&&c<='9')
		st2+=c;
	else
		st3+=c;
}
System.out.println(st1+" "+st2+" "+st3);

}
	}

