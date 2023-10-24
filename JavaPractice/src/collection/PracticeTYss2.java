package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PracticeTYss2 {

	public static void main(String[] args) {
	HashSet<Number> hs=new HashSet<>(9);
	System.out.println(hs.isEmpty());
	hs.add(123);
	hs.add(876);
	hs.add(123);
	hs.add(876);
	hs.add(null);
	hs.add(null);
	hs.add(1290);
	hs.add(566);
	hs.add(309);
	hs.add(1167);
	System.out.println(hs);
	LinkedHashSet<Number> lhs=new LinkedHashSet<>(5);
	System.out.println(lhs.size());
	lhs.addAll(hs);
	System.out.println(lhs.size());
	System.out.println(lhs);
	TreeSet<Number> ts=new TreeSet<>();

	System.out.println(ts);
	}

}
