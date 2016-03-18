package Main;
import java.util.*;
public class TC_187_300 {

	public static void main(String[] args) {

		System.out.println(spacesUsed(new String[]{"AdminBrett arrives","lbackstrom arrives","AdminBrett departs","mike arrives",
				 "TheFaxman arrives","AdminBrett arrives","lbackstrom departs","dok arrives",
				 "AdminBrett departs","gt arrives","AdminBrett arrives","lbackstrom arrives",
				 "AdminBrett departs","jhughes arrives","jhughes departs","TheFaxman departs",
				 "MaryJoe arrives","AdminBrett arrives","AdminBrett departs","AdminBrett arrives"}));
		
		
	}
 static  	int spacesUsed(String[] events)
 {
	 HashMap<String,String>map = new HashMap<String,String>();
	
       int count =0;
      for(String word : events)
      {
    	  String[] split = word.split(" ");
            if(!map.containsKey(split[0]))
            {
            	count++;
            	map.put(split[0], split[1]);
            }
            else
            {
            	count--;
            	map.remove(split[0]);
            }
      }
      
      return Math.max(0,count);
      
      
 }
 
 
}
