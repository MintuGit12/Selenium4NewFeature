package scenarioBased;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ScenarioTyss {

public static String compString(String s1,String s2)
{
	char[] ch1=s1.toCharArray();
	char[] ch2=s2.toCharArray();
	char[] ch= (ch1.length>ch2.length)?ch2:ch1;
	for(int i=0;i<ch.length;i++)
	{
		if(ch1[i]==ch2[i])
			continue;
		else if(ch1[i]<ch2[i])
			return s2;
		else if(ch1[i]>ch2[i])
			return s1;
	}
	if(ch.equals(ch1))
	return s2;
	else
	return s1;
}
	public static void main(String[] args) 
	{
		
		ArrayList<String> al=new ArrayList<>();
		boolean b=false;
	Scanner sc=new Scanner(System.in);
	
	do
	{
		System.out.println("enter the product names you want to buy");
		
	al.add(sc.next());
	System.out.println("you want to buy another prod ");
	if(sc.next().equalsIgnoreCase("yes"))
	{
		b=true;
	}
	else
		b=false;
	}while(b==true);
	
System.out.println("finding the max ordered");

	int fcount=1,scount=2;
	//String[] sst=(String[]) al.toArray();
	LinkedHashSet<String> lhs=new LinkedHashSet<>(al);

String fgreat=" ",sgreat=" ";
int fmax=1,smax=1;
for(String s:lhs)
{
	int count=0;
	for(int j=0;j<al.size();j++)
	{
	if(s.equals(al.get(j)))
	{
		count++;
	}
	}
	if(count>fmax && count>smax)
	{
		smax=fmax;
		fmax=count;
		sgreat=fgreat;
		fgreat=s;
	}
	else if(count>smax)
	{
		smax=count;
		sgreat=s;
	}
	
}
//System.out.println(fgreat+" is here ordered "+fmax+" times");
//System.out.println(sgreat+" second max ordered with "+smax+" times");
if(fmax>smax)
	System.out.println(fgreat+" is here ordered "+fmax+" times");

else if(fmax==smax && fmax>1 &&smax>1)
{
	String s=compString(fgreat, sgreat);
	System.out.println(s);
/*char[] ch1=fgreat.toCharArray();
char[] ch2=sgreat.toCharArray();
for(int i=0;i<ch1.length;i++)
{
if(ch1[i]>ch2[i])
{
	System.out.println(fgreat);
	break;
}
else if(ch1[i]<ch2[i])
{
	System.out.println(sgreat);
	break;
}
	}*/
}
//else 
	//System.out.println(fgreat+" is here ordered "+fmax+" times");
else if(fmax==1&&smax==1)
{
	String ss=al.get(0);
	for(int i=1;i<al.size();i++)
	{
		 ss = compString(ss,al.get(i));
		// System.out.println(ss);
	}
	System.out.println(ss+" is the least in stock");
}
}
	}

