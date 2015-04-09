package Main;

import java.io.IOException;
import java.util.HashSet;

public class TC2014_250_1C {

	public static void main(String[] args) throws IOException, Exception {
		
		
		
		
		
	}
	static String removeDuplicates(String S)
	{
		String res ="";
		HashSet<Character>set = new HashSet<Character>();
		for(int i = 0 ; i < S.length();++i)
			if(set.add(S.charAt(i)))
				res +=S.charAt(i);
		
		
		return res;
		
	}
	
	
}
