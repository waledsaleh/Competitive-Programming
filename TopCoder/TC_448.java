package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TC_448 {

	

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] a = new String[2];
		for(int i = 0 ; i <a.length;++i)a[i]=br.readLine();
		
		System.out.println(score(a));
		
	}
	public static int score(String[] cards)
	{
		int count =0;
		
		for(int i = 0 ; i <cards.length;++i)
		{
			if(cards[i].charAt(0)>='A'&&cards[i].charAt(0)<='Z')
			{
				switch(cards[i].charAt(0))
				{
				
				case 'K': count +=10;break;
				case 'A': count +=11;break;
				case 'Q': count +=10;break;
				case 'J': count +=10;break;
				case 'T': count +=10;break;
				
				}
				
				
				
			}
			
			else{
				String e = cards[i].charAt(0)+"";
				count += Integer.parseInt(e);
			}
			
		}
		return count;
		
	}
}
