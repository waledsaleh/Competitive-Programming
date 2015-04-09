package Main;
import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.util.Scanner;
import java.util.StringTokenizer;  
public class UVA_12289 {  
	
	
	// One-Two-Three uva
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	Reader.init(System.in);

	int test = Reader.nextInt();String b="";
	
	while(test-->0)
	{
		int two=0,one=0;
		b=Reader.next();
		
		if(b.length()==3)
		{
		if(b.charAt(0)=='o')
		{
			one++;
		}
		if(b.charAt(1)=='n')
				{
			one++;
				}
		if(b.charAt(2)=='e')
		{
		one	++;
		}
		
		 if(b.charAt(0)=='t')
		{
			two++;
			
		}
		if(b.charAt(b.length()-1)=='o')
		{
			two++;
			
		}
		if(b.charAt(1)=='w')
		{
			two++;
		}
		if(one>two)System.out.println(1);
		else
			System.out.println(2);
		}
		else
			System.out.println(3);
		
		
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
