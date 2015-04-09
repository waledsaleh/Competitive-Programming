package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class UVA_10420 {

	public static void main(String[] args) throws IOException {

		Scanner sc= new Scanner(System.in);
	 Map<String,Integer> map = new TreeMap<String,Integer>();
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	while(n-->0)
	{
		String line = br.readLine();
		line =line.split(" ")[0];
		if(!map.containsKey(line))map.put(line, 1);
		else
			map.put(line, map.get(line)+1);
		
		
	}
	 for(Map.Entry<String,Integer>en : map.entrySet())
	 {
		 System.out.println(en.getKey()+" "+en.getValue());
		 
	 }
		
		
	}

		
	
}
