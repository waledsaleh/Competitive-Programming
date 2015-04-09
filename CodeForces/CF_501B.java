package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CF_501B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String,String>map = new HashMap<String,String>();
		int n = sc.nextInt();
		while(n-->0)
		{
			String f = sc.next(),s=sc.next();
			boolean check=false;
			for (Map.Entry<String, String> entry : map.entrySet()) 
				{
					if(entry.getValue().equals(f))
					{
						entry.setValue(s);
						check = true;
						break;
					}
					
				}
			
			if(!check)map.put(f, s);
			
		}	
			System.out.println(map.size());
			
			for (Map.Entry<String, String> entry : map.entrySet())
				System.out.println(entry.getKey()+" "+entry.getValue());
			
			
	}

}
