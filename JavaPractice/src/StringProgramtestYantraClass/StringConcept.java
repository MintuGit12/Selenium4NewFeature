package StringProgramtestYantraClass;

public class StringConcept {

	public static void main(String[] args) {
	String s="Kannada";
	System.out.println(s.startsWith(s,'K'));
	System.out.println(s.subSequence(0, 2));
	System.out.println(s.isEmpty());
	s=s.toLowerCase();
	System.out.println(s);
	s=s.toUpperCase();
	System.out.println(s);
	
	String s1="India is a great country     ";
	System.out.println(s1.length());
	System.out.println(s1.trim().length());
	
	String s2="hii hello welcome";
	System.out.println(s2.replace(" ",""));
	}

}
