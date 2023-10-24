package Java8NewConcepts;


public class MainLembdaEx {

	public static void main(String[] args){
		LamdaInterface l=new LamdaInterface() {
			public void testLembda(String s)
			{
				System.out.println(s);
			}
		};
l.testLembda("testing the knowledge of lembda");
		
	}

}
