package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class UVA_12592 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());	
    		  
		HashMap<String,String>map  = new HashMap<String,String>();
		while(n-->0)
		{
			String name1=br.readLine();
			String name2=br.readLine();
			map.put(name1, name2);
			
		}
		n = Integer.parseInt(br.readLine());
		while(n-->0)
		{
			System.out.println(map.get(br.readLine()));
			
		}
	}

}
