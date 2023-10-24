package StringProgramtestYantraClass;

public class ReverseString {

	public static void main(String[] args) {
		String s="String is getting reversed";
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
		System.out.println();
		
		
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
			System.out.print(ch[i]);
		System.out.println();
		
		
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
			s1+=s.charAt(i);
		System.out.println(s1);
		
		ch=s.toCharArray();
		String s2="";
	int l=ch.length-1;
			while(l>=0)
			{
				s2+=s.charAt(l);
				l--;
			}
			System.out.println("reverse  :"+s2);
			
			StringBuffer sb=new StringBuffer("Softwere");
			System.out.println(sb.reverse());
	}

}
