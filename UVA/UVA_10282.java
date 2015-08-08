package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class UVA_10282 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String,String>map = new HashMap<String,String>();
		String line,line2;
		while(!(line =br.readLine()).equals(""))
		{
			
			StringTokenizer st = new StringTokenizer(line);
			line = st.nextToken();
			
			line2=st.nextToken();
			map.put(line2, line);
			
			
			
		}
		
			while((line =br.readLine())!=null)
			{
			if(map.containsKey(line))
			System.out.println(map.get(line));
			else
				System.out.println("eh");
			
			}
		
	}

}
