package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.*;
//12577 - Hajj-e-Akbar

public class UVA_12577 {

	
	public static void main(String[] args) throws IOException,Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	
	r.init(System.in);
	
	String word ;int count=1;
	while(!(word=br.readLine()).equals("*"))
	{
		
		int length=word.length();
		
		if(length==4)
		{
			System.out.println("Case "+count+": "+"Hajj-e-Akbar");
			count++;
		}
		else
		{
			System.out.println("Case "+count+": "+"Hajj-e-Asghar");count++;
		}
	}
	
	}
	
}
class r {  
	 static BufferedReader reader;  
	    static StringTokenizer tokenizer;  
	    /** call this method to initialize reader for InputStream */  
	    static void init(InputStream input) {  
	         reader = new BufferedReader(new InputStreamReader(input));  
	         tokenizer = new StringTokenizer("");  
	    }  
	    /** get next word */  
	    static String next() throws IOException {  
	         while ( ! tokenizer.hasMoreTokens() ) {  
	              //TODO add check for eof if necessary  
	              tokenizer = new StringTokenizer(reader.readLine());  
	         }  
	         return tokenizer.nextToken();  
	    }  
	    static int nextInt() throws IOException {  
	         return Integer.parseInt( next() );  
	    }  
	    static double nextDouble() throws IOException {  
	         return Double.parseDouble( next() );  
	    }  
	}  