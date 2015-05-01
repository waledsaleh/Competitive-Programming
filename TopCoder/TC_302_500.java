package Main;

import java.util.Collections;
import java.util.Vector;

public class TC_302_500 {

	public static void main(String[] args) {

		String[] s = newStatistics(new String[]	

{"John-DH", 
 "Jack-SP", 
 "Sam-OF", 
 "John-SP", 
 "John-RP"});
		for(String k :s)System.out.println(k);
		
		
	}
	static String[] newStatistics(String[] placeboard)
	{
		String[] newList = new String[placeboard.length];
		int count =0;
		for(int i =0; i < placeboard.length;++i)
		{
			String name[] = placeboard[i].split("-");
			
			Vector<String>v  = new Vector<String>();
			for(int j=0;j<placeboard.length;++j)
			{
				if(i==j)continue;
				String[] last = placeboard[j].split("-");
				if(name[0].equals(last[0]))v.add(last[1]);
			
				
			}
			Collections.sort(v);
			newList[count]=name[0]+"-"+name[1];
			for(int k = 0; k <v.size();++k)newList[count] +=","+v.elementAt(k);
			
			++count;
			
		}
		
		return newList;
		
	}
}
