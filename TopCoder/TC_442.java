package Main;

import java.io.IOException;
import java.util.HashSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_442 {

  	public static void main(String[] args) throws IOException {
         
  		
  		
  		
  		
	}
	static int points(String[] player, String[] dictionary)
	{
		HashSet<String >set = new HashSet<String>();
		for(int i = 0 ; i < player.length;++i)set.add(player[i]);
		
		HashSet<String >set2 = new HashSet<String>();
		for(int i = 0 ; i < dictionary.length;++i)set2.add(dictionary[i]);
		
		int sum =0;
		Vector<String> v = new Vector<String>(set);
		for(int i = 0 ; i < v.size();++i)
		{
			if(set2.contains(v.elementAt(i)))sum +=Math.pow(v.elementAt(i).length(),2);
					
		}
		return sum;
		
	}
	
}
