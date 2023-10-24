package testYantraClass;

import java.security.KeyStore.Entry;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
//import java.util.Map.Entry;
public class MapEx {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(1,"Ram");
		ht.put(2, "Ram");
System.out.println(ht);
Enumeration<String> all = ht.elements();
while(all.hasMoreElements())
	System.out.println(all.nextElement());
ht.put(2, "Shayam");
System.out.println(ht);
System.out.println(".........................................");
HashMap<Integer, String> hm=new HashMap<>();
hm.put(2, "Naagin");
hm.put(null, "Amit");
hm.put(3, null);

for(java.util.Map.Entry<Integer, String> en: hm.entrySet())
{
	System.out.println(en.getKey()+"---->>>>>"+en.getValue());
}
	
	}

}
