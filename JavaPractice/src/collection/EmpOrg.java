package collection;

public class EmpOrg implements Comparable{
	String name;
	int sal;
public EmpOrg(String name,int sal)
{
	this.name=name;
	this.sal=sal;
}
	public static void main(String[] args) {
	

	}
@Override
public String toString() {
	
	return name;
}
	@Override
	public int compareTo(Object o) {
		return 0;
	}

}
