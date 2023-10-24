package Java8_new_feature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>
{
	//decending order
	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1<o2)?-1:(o1>o2)?+1:0;
		/*if(o1<o2)
		return +1;//naturally its opposite//(-1-->+1)
		else if(o1>o2)
			return -1;
		else 
			return 0;*/
	}

}
public class ImplementMyComparator {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(100);
		al.add(23);
		al.add(234);
		al.add(45);
		al.add(76);
		System.out.println(al);
		System.out.println("-------------------");
		Collections.sort(al,new MyComparator());
		System.out.println(al);

	}

}
