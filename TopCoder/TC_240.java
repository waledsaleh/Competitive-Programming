package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TC_240 {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] w = new String[3];
		for(int i = 0 ; i <w.length;++i)w[i]=br.readLine();
		
		System.out.println(canPronounce(w));
		
	}
	// Organized thinking
	public static String canPronounce(String[] words)
	{
		
		
		for(String w : words)
		{
			
		    for(int i = 0 ; i+2 <w.length();++i)
		    {
		    	// check first , second and third
		    	
			    if(!vowel(w.charAt(i))&&!vowel(w.charAt(i+1))&&!vowel(w.charAt(i+2))) 
		    	return w;
		    	
		    	
		    }
		
		    for(int i = 0 ; i+1 <w.length();++i)
		    {
			    if(vowel(w.charAt(i))&&
			    		vowel(w.charAt(i+1))&&
			    		Character.toLowerCase(w.charAt(i))!=Character.toLowerCase(w.charAt(i+1))) 
		    	return w;
		    	
		    	
		    }
		    
		}
		return "";
		
	}
	// Check if charatcer is vowel or not
	public static boolean vowel(char c)
	{
		c= Character.toLowerCase(c);// make character small if it is capital, character will small
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
		
	}
}
