package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TCHS_SRM_30_DIV1 {

	public static void main(String[] args) {

		String[]get = getList(new String[]{"sasha 12 5"},"12 5");
		
		for(String j : get)System.out.print(j+" ");
		
	}
   
	
	 static String[] getList(String[] friends, String today)
	 {
		 String sub; Arrays.sort(friends);
		 List<String>list = new ArrayList<String>();     
		for(String day : friends)
		{
		    sub = day.substring(day.indexOf(' ')+1);
			if(sub.equals(today))list.add(day.substring(0,day.indexOf(' ')));
			
		}
		
		return list.toArray(new String[0]);
	 }
	
}
