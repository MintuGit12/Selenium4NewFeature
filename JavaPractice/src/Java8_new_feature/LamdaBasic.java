package Java8_new_feature;

public class LamdaBasic {

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		LamdaBasic lb=new LamdaBasic();
		lb.add(10, 30);
	//	()->System.out.println(a+b);
	}

}
