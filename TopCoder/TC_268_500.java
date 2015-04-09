package Main;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class TC_268_500 {

	public static void main(String[] args)throws IOException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(ambiguous(new String[]{"a","aa","aaa"}));
		
		
		
		
	}
	static int ambiguous(String[] dictionary)
	{	
		HashSet<String>set2 = new HashSet<String>();
		
		HashSet<String>set = new HashSet<String>();
		for(int i = 0 ; i < dictionary.length;++i)set.add(dictionary[i]);
		
		String coc ="";
		for(int i = 0 ; i < dictionary.length;++i)
		{
			 coc ="";
			for(int j =0 ; j < dictionary.length;++j)
			{
				if(i==j)continue;
				coc = dictionary[i]+""+dictionary[j];
				
				if(set.contains(coc))
				{
					set2.add(coc);
					
				}
				else
					set.add(coc);
				
			}
		}
		
		
	
		
		return set2.size();
		
	}
	
}
