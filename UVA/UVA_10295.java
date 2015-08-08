package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UVA_10295 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		Map<String,Integer>map  = new HashMap<String,Integer>();
		int m =Integer.parseInt(st.nextToken()),n = Integer.parseInt(st.nextToken());
		while(m-->0)
		{
			line = br.readLine();
		    st = new StringTokenizer(line);
			map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		    
			
		}
		
		while(n-->0)
		{
			long sum =0;
			while(!(line=br.readLine()).equals("."))
			{
				st = new StringTokenizer(line);
				while(st.hasMoreElements())
				{
					String get = st.nextToken();
					if(map.containsKey(get))sum +=map.get(get);
					
				}
				
			}
			System.out.println(sum);
		}
		
	}

}
