package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;

public class PracticeTyss3 implements Comparable{

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
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
