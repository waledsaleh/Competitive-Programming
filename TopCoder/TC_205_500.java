package Main;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Vector;

public class TC_205_500 {
	public static void main(String[] args) throws IOException {

           System.out.println(countKeywords("in debbtt againn and aAgain and AGAaiIN",
        		   new String[]{"AGAIN","again","Again","again"}));

        			
           
		
	}
	static  int countKeywords(String subjectLine, String[] keywords)
	{
	  
		StringTokenizer st = new StringTokenizer(subjectLine);
   //String less_spaces = subjectLine.replaceAll("\\s+", " ").toLowerCase();
		
	String[] words = new String[st.countTokens()];//less_spaces.split(" ");
	for(int  i = 0 ; i < words.length;++i)words[i]=st.nextToken().toLowerCase();
	
	//Using replaceAll("(.)\\1*","$0+")
	//"k+e+w+o+r+d+s+".
	//This can now be used as a pattern in the Java regular expression matching method of the String class. 
	for(int i = 0 ; i < keywords.length;++i)
	{
		keywords[i]=keywords[i].toLowerCase().replaceAll(".", "$0+");
	}
		int c=0;
		
		for(int i = 0 ; i < words.length;++i)
		{
			for(int j = 0 ; j < keywords.length;++j)
			{
				if(words[i].matches(keywords[j]))
				{
					++c;
					break;
				}
			}
		}
	
	
	return c;
	}
	
}
