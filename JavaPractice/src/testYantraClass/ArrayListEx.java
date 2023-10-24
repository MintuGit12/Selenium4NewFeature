package testYantraClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ArrayListEx {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(30);
	al.add(20);
	al.add(2);
	al.add(112);
	Collections.sort(al);
	System.out.println(al);
	al.add("shayam");
	System.out.println(al);
	ArrayList al2=new ArrayList(5);
	al2.add("Ram");
	al2.add("Shayam");
	al2.add(120.87);
	al2.add('a');
	al2.add(234);
	al2.add(null);
	System.out.println(al2);
	ArrayList al3=new ArrayList(al);
	System.out.println(al3);
	al3.add(al);
	al3.add(al2);
	System.out.println(al3);
	if(al3.contains("Shayam"))
		System.out.println("Shayam is here");
	else
		System.out.println("Shayam is not here");
	System.out.println(al3.remove("Shayam"));
	System.out.println("...........................................");
	for(Object ob:al3)
		System.out.println(ob);
	
	Stack s=new Stack();
	s.push(20);
	s.push(30);
	s.push(123.4);
	for(int i=0;i<s.size()+1;i++)
	System.out.println(s.pop());
	}

}
