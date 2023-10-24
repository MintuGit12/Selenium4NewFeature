package Java8_new_feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ImplementMycomparatorWithLembda {

	public static void main(String[] args) {
		/*Comparator<Integer> comp=(o1,o2)->{if(o1<o2)
			{return -1;}
		else if(o1>o2)
			{return +1;}
		else 
			{return 0;}
		};*/
		//Comparator with Ternary operator
		Comparator<Integer> comp=(o1,o2)->{return (o1<o2)?+1:(o1>o2)?-1:0;};
ArrayList<Integer> al=new ArrayList<>();
al.add(100); 
al.add(100);
al.add(23);
al.add(234);
al.add(45);
al.add(76);
al.add(1);
al.add(2);
System.out.println(al);
System.out.println("----------------------------------");
Collections.sort(al,comp);
System.out.println(al);
System.out.println(".....................Print using stream");
al.stream().forEach(System.out::println);
//print only the even number from the list in an decending order using Java Stream
List<Integer> al2=al.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(al2);
	}


}
