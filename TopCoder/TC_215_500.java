package Main;

import java.io.IOException;
import java.util.HashSet;
import java.util.Vector;

public class TC_215_500 {
	public static void main(String[] args) throws IOException {

		
		System.out.println(impossible("AAAAAAABBCCCCCDDDEEE123456789",new String[]{"123C","123A","123 ADA"}));
		
		
	}
	
	static int impossible(String collection, String[] address)
	{
		int count =0;
		
		for(int i = 0 ; i < address.length;++i)
		{
			String word = address[i].replaceAll(" ", "");
			Vector<Character> set = new Vector<Character>();
			
			for(int q = 0 ; q < collection.length();++q)set.add(collection.charAt(q));
			
			for(int j =0; j < word.length();++j)
			{
			   	if(set.contains(word.charAt(j)))set.removeElement(word.charAt(j));
			   	else
			   	{
			   		count++;
			   		break;
			   	}
				
			}
			
		}
		return count;
		
	}
	

}
