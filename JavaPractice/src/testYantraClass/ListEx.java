package testYantraClass;

import java.util.Collections;
import java.util.LinkedList;

public class ListEx {

	public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList();
	ll.add("Ram");
	ll.add("shayam");
	ll.add("Ramesh");
	ll.add("yukta");
	ll.add("Biswa");
	Collections.sort(ll);
	System.out.println(ll);
	Collections.reverse(ll);
	System.out.println(ll);
	for(int i=0;i<ll.size();i++)
		System.out.println(ll.get(i));
	LinkedList<Object> ll2=new LinkedList<Object>();
	ll2.add("ravi");
	ll2.add(100.5);
	ll2.add(104);
	ll2.add('a');
	ll2.add(null);
	ll2.addFirst("Zeba");
	ll2.addLast("Zebra");
	System.out.println(ll2);
	ll2.removeFirst();
	ll2.removeLast();
	System.out.println(ll2);
	System.out.println(ll2.getFirst());
	System.out.println(ll2.getLast());
	System.out.println(ll2.size());
	}

}
