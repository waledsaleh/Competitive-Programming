package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class URI_1250 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	R.init(System.in);
	

	int test = sc.nextInt();
	int[] array_height;String jup_st;
	int count,number_of_pattern;
	while(test-->0)
	{
	number_of_pattern=sc.nextInt();	
		count=0;
		array_height=new int[number_of_pattern];
		
		
		
		for(int i = 0 ; i <array_height.length;i++)
		{
			array_height[i]=sc.nextInt();
		}
		jup_st=sc.next();
		for(int i = 0 ; i <array_height.length;i++)
		{
			if(array_height[i]==1||array_height[i]==2)
			{
				if(jup_st.charAt(i)=='S')
				{
					count++;
				}
			}
			if(array_height[i]>2)
			{
				if(jup_st.charAt(i)=='J')
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	
	
	}


}

 class R {  
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
