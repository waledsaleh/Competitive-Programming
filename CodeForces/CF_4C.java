package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class CF_4C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		
		int n =sc.nextInt();
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		
		while(n-->0)
		{
			String name = sc.next();
			if(!map.containsKey(name))
			{
				map.put(name, 0);
				System.out.println("OK");
			}
			else
			{
				map.put(name, map.get(name)+1);
				System.out.println(name+""+map.get(name));
			}
			
		}
		
		
		
		
		
	}

}
