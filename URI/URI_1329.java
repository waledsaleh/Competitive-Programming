package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class URI_1329 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	Reader.init(System.in);
	while(true)
	{
	int n = Reader.nextInt();
	if(n==0)break;
	int[] array = new int[n];
	for(int i = 0 ; i <array.length;i++)
	array[i]=0;
	
	for(int i = 0 ; i <array.length;i++)
		array[i]=Reader.nextInt();
	won(array);
	
	//Binary_search(array);
	
	}
	
	}
	public static void won(int[]array)
	{
		int countm =0,countJ=0;
		boolean f = true;
		for(int i = 0 ; i <array.length;i++){
		if(array[i]==0){
		countm++;
		
		}
		
		else
			countJ++;
	
		}
		//Mary won 3 times and John won 2 times
		
	System.out.printf("Mary won %d times and John won %d times\n",countm,countJ);
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
