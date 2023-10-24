package collection;

import java.util.Comparator;

public class DefaultNaturalSorting implements Comparator<EmpOrg> {

	public static void main(String[] args) {

	}

	@Override
	public int compare(EmpOrg o1, EmpOrg o2) {
		if(o1.sal>o2.sal)
			return +1;
		else if(o1.sal<o2.sal)
		return -1;
		else
			return 0;
	}

}
