/**
 * 
 */
package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author waled
 *
 */

//13356 - Count Zero Spoj

public class SPOJ_13356 {
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	Reader.init(System.in);
	
	int test =Reader.nextInt();
	BigInteger n;BigInteger b;
	while(test-->0)
	{
	int count=0;BigInteger f=new BigInteger("1");
		n=sc.nextBigInteger();
		b=sc.nextBigInteger();
		for(long i =1 ; i <=n.longValue();i++)
		{
			f=f.multiply(BigInteger.valueOf(i));
			
		}
		//System.out.println(f);
		
		String zero="";
		while(f.compareTo(BigInteger.ZERO)!=0)
		{
			if(f.remainder(b).compareTo(BigInteger.ZERO)==0)
			{
			zero+="0";
			
			}
			
			else
				break;
			f=f.divide(b);
		}
		for(int i = 0; i <zero.length();i++)
		{
			if(zero.charAt(i)=='0')
			{
				count++;
			}
		}
		System.out.println(count);
		
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
