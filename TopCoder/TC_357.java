package Main;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TC_357 {

	public static void main(String[] args) {

	System.out.println(getPhrase("25735", new String[]{"is", "there", "anybody", "out", "there"}));
		
		
	}
  static String getPhrase(String number, String[] dictionary)
  {
	 Arrays.sort(dictionary);
	 boolean[]vis = new boolean[dictionary.length];
	 String res ="";
	  for(int i = 0 ; i < number.length();++i)
	  {
		  for(int j=0;j<dictionary.length;++j)
		  {
			  if(!vis[j]&&dictionary[j].length()==number.charAt(i)-'0'){
				  res +=" "+dictionary[j];
				  vis[j]=true;
				break;
			  }
				  
			  
		  }
			  
		  
	  }
	 
	  
	  return res.trim();
  }
  
  
}
