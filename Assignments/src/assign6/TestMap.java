package assign6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class TestMap {

	public static void main(String[] args) {
		TreeMap<String, List<String>> treeMap = new TreeMap<String, List<String>>();
		
		ArrayList<String> b1 = new ArrayList<String>();
		b1.add("AVNT");
		b1.add("AMPT");
		b1.add("MTN");
		
		ArrayList<String> b2 = new ArrayList<String>();
		b2.add("LBC");
		b2.add("GWK");
		b2.add("NAD");
		
		ArrayList<String> b3 = new ArrayList<String>();
		b3.add("BCR");
		b3.add("PKB");
		b3.add("DDT");
		
		treeMap.put("Hyderabad", b1);
		treeMap.put("Visakhapatnam", b2);
		treeMap.put("Vijayawada", b3);
		
		treeMap.put("Mumbai", Arrays.asList("Juhu","Bandra","CG"));
		
		Set<Entry<String, List<String>>> set = treeMap.entrySet();
		
		for (Entry<String, List<String>> entry : set) {
			for (int i = 0; i < entry.getValue().size(); i++) {
				System.out.println(entry.getKey()+":"+entry.getValue().get(i));
			}
			System.out.println();
		}
	}

}
