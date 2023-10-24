package self;
public class ObjectClassPractice {
static String s="Sumant Kumar";
int i=100;
public String toString()
{
	return s;
}
@Override
	public int hashCode() {
		return super.hashCode();
	}
	public static void main(String[] args) {
		ObjectClassPractice o=new ObjectClassPractice();
		System.out.println(o);
int i1=o.hashCode();
System.out.println(i1);

	}

}
