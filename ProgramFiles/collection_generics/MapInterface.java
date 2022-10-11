package collection_generics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		Map<String, String> map = new  HashMap<>();// doesn't give sequence of values
		
		map.put("myName", "Karthick");
		map.put("company", "CTS");
		map.put("transport", "Bus");
		Set<String> keys = map.keySet();
		for(String key:keys) {
		System.out.println(key + " " +map.get(key));
		}
		
		
		// Map<String, String> m = new  Hashtable<>();
	}

}
