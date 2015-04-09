package Main;

import java.io.IOException;

public class TC_621 {

	
	public static void main(String[] args) throws IOException {

		
		
		
	}
	
	static String sortingMethod(String[] stringList)
	{
		boolean b = false;
		boolean lex = false;
		boolean len = false;
		if(stringList.length==1)return "both";
		
		for(int i = 0 ; i < stringList.length;++i)
		{
			for(int j = i+1;j<stringList.length;++j)
			{
				if(stringList[i].compareTo(stringList[j])<0)
				{
					lex = true;
					
				}
				
				else
				{
					lex = false;
					break;
				}
			}
			if(!lex)
			{
				break;
			}
		}
		
		for(int i = 0 ; i < stringList.length;++i)
		{
			for(int j = i+1;j<stringList.length;++j)
			{
				
				 if(stringList[i].length()<stringList[j].length())
				{
					len = true;
				}
				else
				{
					len = false;
					break;
				}
			}
			if(!len)
			{
				break;
			}
		}
		if(len &&lex)return "Both";
		else if(!len && lex)return "lexicographically";
		else if(len && !lex)return "lengths";
		
		return "none";
	}
	
}
