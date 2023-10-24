package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class practiceTYss {

	public static void main(String[] args) {
	ArrayList<Number> al=new ArrayList<>();
	System.out.println(al.size());
	al.add(123);
	al.add(34);
	al.add(0, 223);
	al.add(43);
	System.out.println(al.size());
	System.out.println(al);
	ArrayList<Number> al1=new ArrayList<>(al);
	//al1.addAll(al);
	al1.add(98);
	al1.add(789);
	al1.add(123);
	al1.add(123);
	System.out.println(al1);
	System.out.println(al1.size());
	al1.remove(5);
	System.out.println(al1);
	al1.retainAll(al);
	System.out.println(al1);
	System.out.println(al1.containsAll(al));
	al1.retainAll(al);
	System.out.println(al1);
	 Object[] all = al.toArray();
	for(Object i:all)
	{
		System.out.println(i+" for-each");
	}
	Iterator<Number> al11 = al1.iterator();
	while(al11.hasNext())
	{
		int i=(int) al11.next();
		if(i==34)
		{
			al11.remove();
		}
		//System.out.println(i+" iterator");
	}
	System.out.println(al1);
	System.out.println(al1.lastIndexOf(43));
	al1.set(0, 990);
	System.out.println(al1);
	System.out.println(al1.get(2));
	Vector<Number> v=new Vector<>(al1);
	v.add(167);
	v.add(98);
	System.out.println(v.capacity()+"...........");
	Enumeration<Number> enu = v.elements();
	int count=0;
	while(enu.hasMoreElements())
	{count++;
		 int i = (int)enu.nextElement();
		if(i==167)
		{
			v.set(count, 16777777);
		}
			System.out.println(i);
	}
	Stack<Number> st=new Stack<>();
	st.add(1245);
	st.add(987);
	st.add(787);
	st.addAll(1, al1);
	st.push(654);
	for(Number i:st)
	{
		System.out.println(i+"......");
	}
	System.out.println(st);
	System.out.println(st.pop()+"....");
	System.out.println(st.peek()+"..........");
	
	System.out.println(st);
	ListIterator<Number> li1 = st.listIterator();
	while(li1.hasNext())
	{
		System.out.println(li1.next()+" >>>>>>");
	}
	
	while(li1.hasPrevious())
	{
		System.out.println(li1.previous()+" <<<<<<");
	}
	
	}

}
