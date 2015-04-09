package Main;

import java.util.HashMap;
import java.util.Scanner;

public class CF_271A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		
		
		boolean check = false;
		for(int i = y+1 ; i <=10000;++i)
		{
			String line = String.valueOf(i);
			HashMap<Character,Integer>map = new HashMap<Character,Integer>();
			for(int j  = 0 ; j < line.length();++j)
			{
				if(!map.containsKey(line.charAt(j)))
				{
					map.put(line.charAt(j), 1);
				 check = true;	
				}
				else
				{
					check =false;
					break;
				}
			}
			if(check)
			{
				System.out.println(i);
				return;
			}
		}
		
		
	}

}
