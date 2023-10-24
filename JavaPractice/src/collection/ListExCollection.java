package collection;

import java.util.ArrayList;
import java.util.LinkedList;

import raghusir.NumberReverse;

public class ListExCollection{

	public static void main(String[] args)
	{
	ArrayList<Number> ar=new ArrayList<Number>();
	System.out.println(ar.size());
	ar.add(10);
	ar.add(234);
	ar.add(456);
	System.out.println("......."+ar.size());
	System.out.println(ar);
for(Number num:ar)
{
	System.out.println(num);
}
LinkedList<Number> ll=new LinkedList<>();
System.out.println(ll.size());
	}

}



}
