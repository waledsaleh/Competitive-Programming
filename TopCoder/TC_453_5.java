package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class TC_453_5 {

	public static void main(String[] args) throws IOException {

		
		
		
	}
	static int countTools(String[] need)
	{
		Set<String>s = new HashSet<String>();
		for(int i = 0; i < need.length;++i)
		{
			String[] str = need[i].split(" ");
			for(String j : str)
			s.add(j);
			
		}
		return s.size();
	}
	
}