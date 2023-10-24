package collection;

import java.util.HashMap;
import java.util.Scanner;

public class MapLogic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String key = sc.nextLine();
	HashMap<String,Integer> hm=new HashMap<>();
	hm.put("lokesh", 112);
	hm.put("rahul", 114);
	hm.put("mahesh", 12);
	hm.put("kajal", 512);
	hm.put("ram", 987);
	System.out.println(hm.get(key));
	System.out.println(hm.get("rahul"));
	for(String s:hm.keySet())
	{
		System.out.println(s);
	}
	for(Integer i:hm.values())
	{
		System.out.println(i);
	}
	
	}

}
