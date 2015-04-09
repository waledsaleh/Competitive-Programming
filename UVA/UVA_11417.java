package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_11417 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	Reader.init(System.in);
	
	while(true)
	{
	int n = Reader.nextInt();
	if(n==0)break;
	int sum=0;
	
	for(int i =1;i<n;i++)
		for(int j = i+1;j<=n;j++)
		{
			sum+=GCD(i,j);
		}
	
	System.out.println(sum);
	}
	}
	
	public static int GCD(int i , int j)
	{
		if(j==0)return i;
		
		return GCD(j,i%j);
		
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