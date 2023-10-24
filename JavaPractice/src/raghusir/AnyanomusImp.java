package raghusir;
interface iInter
{
	String s="raghu";
	public void m1();
}
public class AnyanomusImp implements iInter{

	public static void main(String[] args) {
		iInter i=new iInter() {
			
			@Override
			public void m1() {
				System.out.println("this is AnyanomusImp class");
				
			}
		};
		System.out.println(i.s);
System.out.println(i);
	}

	@Override
	public void m1() {
	System.out.println("this is common implementation");
		
	}

}
