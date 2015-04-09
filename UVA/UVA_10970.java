package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;


//10970 - Big Chocolate

public class UVA_10970 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Reader.init(System.in);
	Scanner sc = new Scanner(System.in);
	try{
		while(sc.hasNextInt())
		{
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int count=n*m;
		
		
		System.out.println(count-1);
		}
		
		}catch(InputMismatchException e)
		{}
		
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