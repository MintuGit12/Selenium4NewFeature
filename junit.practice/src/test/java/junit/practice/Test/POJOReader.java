package junit.practice.Test;

public class POJOReader {

	public static void main(String[] args) {
	POJOEmployee p1=new POJOEmployee();
	p1.setId(123);
p1.setName("Rahul");
p1.setSal(45000);
POJOEmployee p2=new POJOEmployee();
p2.setId(1234);
p2.setName("Rohal");
p2.setSal(41000);
System.out.println("working on POJO");
System.out.println(p1.getName());
System.out.println(p2.getSal());
	}

}
