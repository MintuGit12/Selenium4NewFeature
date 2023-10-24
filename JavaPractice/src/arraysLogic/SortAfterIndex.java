package arraysLogic;

import java.util.TreeSet;

public class SortAfterIndex {

	public static void main(String[] args) {
		int[] arr= {12,23,45,3,4,56,65,222,2,1};
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(i<=3)
				System.out.println(arr[i]+" ");
			else if(i>3)
				ts.add(arr[i]);
		}
for(Integer i:ts)
	System.out.println(i+" ");
	}

}
