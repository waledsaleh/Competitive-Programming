package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Microsoft_Task_A_Sorting {

	public static void main(String[] args) throws IOException {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 String words = br.readLine();
		 String[]split = words.split(",");
		 
		 
		long sum =0;
		Arrays.sort(split);
		 TreeMap<String,Integer>freq = new TreeMap<String,Integer>();
		 for(String j : split)
		 {
			 if(!freq.containsKey(j))freq.put(j, 1);
			 else
				 freq.put(j, freq.get(j)+1);
			 
		 }
		 int count =1;
		
		 for(Map.Entry<String, Integer>map : freq.entrySet())
		 { 
			 long mult=1;
			 mult *=count*map.getValue();
			 int sumChar=0;
			 for(int i = 0 ; i < map.getKey().length();++i)sumChar +=(map.getKey().charAt(i)-'A')+1;
			 mult *=sumChar;
			 
			 sum +=mult;
			 count++;
		 }
		 System.out.println(sum);
	}

}
