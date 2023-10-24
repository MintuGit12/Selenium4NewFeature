package stringConcept;

public class StringBufferBuilder {

	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("ramesh kumar");
	StringBuffer sb1=new StringBuffer("ramesh kumar");
	System.out.println("this is "+sb.compareTo(sb1));
System.out.println(sb.reverse());
System.out.println(sb.insert(0, "kumar"));
System.out.println(sb.deleteCharAt(0));
for(int i=0;i<sb.length();i++)
{
	System.out.println(sb.charAt(i));
}
String s="niranjan kumar";
String s1=new String("NIRANJAN KUMAR");
System.out.println(s.compareToIgnoreCase(s1));
System.out.println(s.lastIndexOf('s'));
	}

}
