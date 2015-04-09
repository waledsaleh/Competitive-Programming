package Main;

import java.util.Scanner;

public class TC_416{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	System.out.println(listMostCommon(new String[]	

			{"amanda forsaken bloomer meditated gauging knolls",
			 "betas neurons integrative expender commonalities",
			 "latins antidotes crutched bandwidths begetting",
			 "prompting dog association athenians christian ires",
			 "pompousness percolating figured bagatelles bursted",
			 "ninth boyfriends longingly muddlers prudence puns",
			 "groove deliberators charter collectively yorks",
			 "daringly antithesis inaptness aerosol carolinas",
			 "payoffs chumps chirps gentler inexpressive morales"}));
	
	}
	static 	String listMostCommon(String[] text)
	{
		int[] a = new int[125];
			
		for(int i = 0 ; i < text.length;++i)
		{
			for(int j = 0 ; j < text[i].length();++j)
			{
				a[text[i].charAt(j)]++;
				
			}
			
		}
		
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i = 96;i<a.length;++i)
		{
			boolean check =false;
			for(int j = 96 ; j < a.length;++j)
			{
				if(i==j)continue;
			if(Character.isAlphabetic(j))
			{
			if(a[i]>=a[j])
			{
				check=true;
				
			}
			else
			{
				check=false;
				break;
			}
			
			}
			
			}
			
			if(check)sb.append((char)i);
				
		}
		
		
		return sb.toString();
		
	}
}
