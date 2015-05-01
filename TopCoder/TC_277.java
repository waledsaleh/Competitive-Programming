package Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Vector;

public class TC_277 {
   
	public static void main(String[] args) {
       
		System.out.println(whichOrder(new String[]{ "ham", "cheese", "mustard" },
				new String[]{ "ham cheese" }));
		
	}

	static int whichOrder(String[] available, String[] orders)
	{
		HashSet<String> set = new HashSet<String>();
		for(String i : available)set.add(i);
		
		for(int i = 0 ; i < orders.length;++i)
		{
			String[] split = orders[i].split(" ");
			
			boolean check =true;
			for(String j : split)	if(!set.contains(j)){check=false;break;}
			
			if(check)return i;
		}
		
		
		
		return -1;
	}
}
