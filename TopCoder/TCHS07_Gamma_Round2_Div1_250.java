package Main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class TCHS07_Gamma_Round2_Div1_250{

	public static void main(String[] args) {

		String[]s = generateList(new String[]{"apple", "orange", "apple", "banana", "apple", "orange"});
		for(String e : s)System.out.println(e);
		
	}
 static String[] generateList(String[] items)
 {
	 TreeMap<String,Integer>map = new TreeMap<String,Integer>();
	
	 for(int i = 0 ; i < items.length;++i)
	 {
		 if(!map.containsKey(items[i]))map.put(items[i], 1);
		 else
			 map.put(items[i], map.get(items[i])+1);
	 }
	 String s = new String(map.toString());
	 s =s.replace("{", "").replace(" ", "").replace("=",  " - ").replace("}", "");
	 
	return s.split(",");
	 
 }
 
 
}
