package StringProgramtestYantraClass;

public class RemoveTheSpaceBetweenString {

	public static void main(String[] args) {
	String s="remove the space between the string";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==' ')
			continue;
		else
			System.out.print(s.charAt(i));
	}
	}

}
