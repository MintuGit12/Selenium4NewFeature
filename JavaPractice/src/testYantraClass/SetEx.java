package testYantraClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		Set ss=new HashSet<>();
		ss.add("Ram");
		ss.add(null);
		ss.add(100);
		ss.add(100);
		ss.add(null);
		ss.add('s');
		ss.add(102.34);
		System.out.println(ss);
		System.out.println(ss.size());
		System.out.println(ss.remove(100));
		System.out.println(ss.contains("Ram"));
		Iterator it=ss.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(".............................................");
		ArrayList<Object> al=new ArrayList<>(ss);
		 Iterator<Object> it1 = al.iterator();
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println(".................................");
		LinkedHashSet ll=new LinkedHashSet();
		ll.add(100);
		ll.add("amrit");
		ll.add(101.12);
		ll.add('a');
		ll.add('a');
		System.out.println(ll.getClass().getName());
		Object l1 = ll.clone();
		System.out.println(l1);
		System.out.println(ll);
		for(Object l:ll)
			System.out.println(l);
		System.out.println("..............................................");
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Ram");
		ts.add("Shayam");
		ts.add("Amit");
		ts.add("Koral");
		System.out.println(ts);
		TreeSet<String> ts1=(TreeSet<String>) ts.descendingSet();
		System.out.println(ts1);
		//System.out.println(ts.descendingSet());
	}

}
