package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_11777 {
	
	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		R.init(System.in);
		

		int test = R.nextInt();
		int[]array;
		for(int i = 1 ; i <=test;++i)
		{
			array=new int[7];int sum = 0;int avg=0;
			for(int j = 0 ; j <array.length;++j)
			{
				array[j]=R.nextInt();
				
			}
			
			// using bubble sort , sort last three element from array
			for(int p =4;p<array.length;++p)
			{
				for(int c=p+1;c<array.length;++c)
				{
					if(array[p]>array[c])
					{
						int tmp =array[p];
						array[p]=array[c];
						array[c]=tmp;
					}
					
				}
				
			}
			
			sum+=array[5]+array[6];
				
			avg=sum/2;
			int result=0;
			
			//System.out.println(avg);
			for(int w = 0 ;w<4;++w)
			{
				result+=array[w];
				
			}
			result+=avg;
			
			
			 
			if(result>=90)
			{
				System.out.println("Case "+i+": "+"A");
			}
			
			else if (result>=80&&result<90)
			{
				System.out.println("Case "+i+": "+"B");
			}
			else if (result>=70&&result<80)
			{
				System.out.println("Case "+i+": "+"C");
			}
			else if (result>=60&&result<70)
			{
				System.out.println("Case "+i+": "+"D");
			}
			else if (result<60)
			{
				System.out.println("Case "+i+": "+"F");
			}
			
			
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
