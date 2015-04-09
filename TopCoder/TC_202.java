package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//SRM 202 Top coder

public class TC_202 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	Reader.init(System.in);
	
	int n = Reader.nextInt();
String[] s = new String[n];
	for(int i = 0 ; i <s.length;i++)
	{
		s[i]=Reader.next();
	}

	
	int sum =sum(s);
	System.out.println(sum);
	}
	
	public static int sum(String[] s)
	{
			char[] ch;
	int count=0;
	int sum=0;
		for(int i = 0 ; i <s.length;i++)
		{
			ch=s[i].toCharArray();
			
			for(int j = 0 ; j <ch.length;j++)
			{
			if(ch[j]>45||ch[j]<45)	
				count++;
			
			}
			
		}
		
	return count;
		
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