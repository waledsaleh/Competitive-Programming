package Main;

import java.io.IOException;
import java.util.Stack;

public class TC_432 {

	public static void main(String[] args) throws IOException {

		System.out.println(howMany(new String[]{"c"}));
		
	}
	
	static  	int howMany(String[] words)
	{
		int count =0;
		//if(words.length==1)return 1;
		
		for(int i = 0 ; i < words.length;++i)
		{
			String word = words[i];
			boolean f = true;
			for(int j = 0 ; j < word.length();++j)
			{
				char ch = word.charAt(j);
				
				 if(!f)break;
				 f = true;
				for(int k = j+1 ; k <word.length();++k)
				{
					if(!f)break;
					if(ch==word.charAt(k))
					{
						if(word.charAt(k)!=word.charAt(k-1))
						{
							f=false;
							break;
						}
						else
							f=true;
					}
					
				}
				
			}
			if(f)count++;
			
		}
		return count;
	}
	
}

