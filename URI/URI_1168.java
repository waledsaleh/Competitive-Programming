package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class URI_1168 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	Reader.init(System.in);
	int test = Reader.nextInt();
	while(test-->0)
	{
		String numbers =Reader.next();

		int sum=0;
		for(int i = 0 ; i <numbers.length();i++)
		{
			switch(numbers.charAt(i))
			{
			case'1':sum+=2;break;
			case'2':sum+=5;break;
			case'3':sum+=5;break;
			case'4':sum+=4;break;
			case'5':sum+=5;break;
			case'6':sum+=6;break;
			case'7':sum+=3;break;
			case'8':sum+=7;break;
			case'9':sum+=6;break;
			case'0':sum+=6;break;
			}
			
			
			
		}
		System.out.println(sum+" "+"leds");
		
	}
	
	
	}
	

}
class Reader {  
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
