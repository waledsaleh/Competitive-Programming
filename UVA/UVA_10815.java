package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UVA_10815 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		Set<String> set = new HashSet<String>();
		while((line=br.readLine())!=null)
		{
			line = line.toLowerCase();
			line = line.replaceAll("[^a-z]", " ").replace("  ", " ");
			line = line.replace("  ", " ");
			
			String[] split = line.split(" ");
			for(String j : split)
			{
				if(j.equals(""))continue;
				
				set.add(j);
				
			}
		}
		String[]list  = new String[set.size()];
	    set.toArray(list);
	    Arrays.sort(list);
        for(String j :list)System.out.println(j);
	
	}

}
