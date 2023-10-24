package stringConcept;

public class StringBufferConcept {

	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	sb.append("ramesgsjknjslajee");
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb);
	StringBuffer sbb=new StringBuffer();
	sb.append("ramesgsjknjslajee");
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb);
	System.out.println(sb.equals(sbb));
	System.out.println(sb==sbb);
//StringBuilder sb1=new StringBuilder(sb);
	StringBuilder sb1=new StringBuilder(10);//define Capacity
	sb1.append(sb);
System.out.println(sb1.capacity());
System.out.println(sb1.length());
System.out.println(sb1);
StringBuilder sbu=new StringBuilder("ram");
String str=new String("ram");
System.out.println(str.hashCode());
System.out.println(sbu.hashCode());
StringBuffer sb12=new StringBuffer();
System.out.println(sb12.capacity());
StringBuilder sb123=new StringBuilder();
System.out.println(sb123.capacity());
	}

}
