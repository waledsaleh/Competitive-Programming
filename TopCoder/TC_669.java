package Main;

import java.util.HashMap;
import java.util.Map.Entry;

public class TC_669 {

	public static void main(String[] args) {
		System.out.println(maxHappiness(new int[]	
				
				
				{1,2,3,4,5,6,7,8,9,10,100}, new String[]{"a","b","c","d","e","e","d","c","b","a","abcde"}

	));

	}
	 static 	int maxHappiness(int[] h, String[] s){
		   
		   HashMap<String,Integer>map = new HashMap<String,Integer>();
		  
		   int sum = 0;
		   for(int i  =0 ; i <s.length;++i){
			   if(map.containsKey(s[i])){
				   map.put(s[i], Math.max(map.get(s[i]),h[i]));
				   
				   
			   }
			   else
				   map.put(s[i], h[i]);
			   
		   }
		   
		   for(Entry<String, Integer> set:map.entrySet() ){
			   sum += set.getValue();
			   
			   
		   }
		   
		   return sum;
		   
	   }
}
