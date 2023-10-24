package collection;

public class StaticAndNonStatic {
static String s="Ramesh";
String ss="Suresh";
public void m1()
{
	System.out.println(this.s);
	System.out.println(this.ss);
	System.out.println(super.hashCode());
}
	public static void main(String[] args) {
		StaticAndNonStatic snn=new StaticAndNonStatic();
		snn.m1();
		System.out.println();

	}

}
