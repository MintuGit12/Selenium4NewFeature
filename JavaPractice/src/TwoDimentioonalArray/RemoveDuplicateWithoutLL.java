package TwoDimentioonalArray;

public class RemoveDuplicateWithoutLL {

	public static void main(String[] args) {
	String s="AACCDFGACCCVH";
	String s1=" ";
	s1=s1+s.charAt(0);
	for(int i=0;i<s.length();i++)
	{
		for(int j=0;j<s1.length();j++)
		{
			if(s.charAt(i)==s1.charAt(j))
			{
				continue;
			}
			else
			{
				System.out.println("hiii");
				s1=s1+s.charAt(i);
			}
		}
}
	System.out.println(s1);
	}

}
