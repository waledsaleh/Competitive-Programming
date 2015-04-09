package Main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//10392 - Factoring Large Numbers uva

public class UVA_10392 {

	public static void main(String[] args) throws IOException {

		
	Scanner sc=new Scanner(System.in);
	
	Reader.init(System.in);
	
	while(sc.hasNextBigInteger())
	{
		
	BigInteger test = sc.nextBigInteger();
	String e ="-1";
	if(test.compareTo(new BigInteger(e))==0)
	break;
	work(test);
	System.out.print("\n");
	
	}
		
	}
			public static void work(BigInteger n)
			{
					
		
					List<BigInteger>list = new ArrayList<BigInteger>();
					String s ="2";
					
					for(BigInteger i = new BigInteger(s) ; i.multiply(i).compareTo(n)<=0;i=i.add(BigInteger.ONE))
					{
						while(n.mod(i).compareTo(BigInteger.ZERO)==0)
						{
							list.add(i);
							n=n.divide(i);
							
						}
					}
					
					if(n.compareTo(BigInteger.ONE)>0)
						list.add(n);
					
					
					for(BigInteger j:list)
					{
						System.out.println("    "+j);
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

	
	

