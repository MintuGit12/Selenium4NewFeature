package Java8_new_feature;

interface Inter12
{
	public void m1();
	public void m2();
}
public abstract class AnoonymusInnerClasstwoMethods implements Inter12 {

	public static void main(String[] args) {

		Inter12 i=new Inter12() {
			
			@Override
			public void m2() {
			System.out.println("m1");
				
			}
			
			@Override
			
			public void m1() {
		System.out.println("m1");
				
			}
		};
		i.m1();
		i.m2();
		}
	}
