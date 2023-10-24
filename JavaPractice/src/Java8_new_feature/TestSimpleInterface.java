package Java8_new_feature;

public interface Interf {
public void m1();
}
class Demo implements Interf
{
	public void m1() {
		System.out.println("simple implementation in 1.7");
	}
}
class TestSimpleInterface
{
	public static void main(String[] args) {
		Interf i=new Demo();
		i.m1();
	}
}