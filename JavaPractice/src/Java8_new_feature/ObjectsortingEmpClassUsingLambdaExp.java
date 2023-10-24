package Java8_new_feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	String name;
	int empno;
	Employee(String name,int empno)
	{
		this.name=name;
		this.empno=empno;
	}
	public String toString()
	{
		return name+"-->>>"+empno;
	}
}
public class ObjectsortingEmpClassUsingLambdaExp {

	public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<>();
	al.add(new Employee("Sagat Singh", 100));
	al.add(new Employee("Hanumath singh",400));
	al.add(new Employee("Bhavani singh",890));
	al.add(new Employee("Shaitan Singh",760));
	System.out.println(al);
	Comparator<Employee> comp=(e1,e2)->(e1.empno<e2.empno)?-1:(e1.empno>e2.empno)?1:0;
	Collections.sort(al,comp);
	System.out.println("ascending order is in respect to empno"+al);
	System.out.println();
	Collections.sort(al,(e1,e2)->e1.name.compareTo(e2.name));
	System.out.println("To compare the string use always compareTo() "+al);
	Comparator<Employee> comp1=(e1,e2)->{if(e1.name.compareTo(e2.name)<1)
		{return +1;}
	else if(e1.name.compareTo(e2.name)>=1)
		{return -1;}
	else
		{return 0;}
	};
	//printing name in descending order
	Collections.sort(al,comp);
	System.out.println("printing name in descending order "+al);
	}

}
