package stringLogic;

import java.util.Scanner;

public class LastUpper {
public static void lastUpper(String st)
{
	char[] ch=st.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(i==ch.length-1 && ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
		{
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		}
		else if(ch[i]>='A'&&ch[i]<='Z')
			ch[i]=(char)(ch[i]+32);
	}
	st=new String(ch);
	System.out.println(st);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String :");
		String st=sc.nextLine();
		//st=' '+st;
		lastUpper(st);

	}

}
