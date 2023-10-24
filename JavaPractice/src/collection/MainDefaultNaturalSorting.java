package collection;

import java.util.TreeSet;

public class MainDefaultNaturalSorting {

	public static void main(String[] args) {
	TreeSet<EmpOrg> ts =new TreeSet<>(new DefaultNaturalSorting());
	ts.add(new EmpOrg("Amit",5677));
	ts.add(new EmpOrg("Basant",7865));
	ts.add(new EmpOrg("Zain",980));
	ts.add(new EmpOrg("Charlie",5600));
	ts.add(new EmpOrg("Docker",567700));
	System.out.println(ts);
	}

}
