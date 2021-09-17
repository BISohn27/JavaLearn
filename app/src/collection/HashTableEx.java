package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable();
		map.put("a1", "��1");
		map.put("a2", "��2");
		map.put("a3", "��3");
		String result = map.get("a1");
		System.out.println(result);
		map.remove("a1");
		Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String val = map.get(key);
			System.out.println("Ű: " + key+ "\t"+ "��: " + val);
		}
	}

}
