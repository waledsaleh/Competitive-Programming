package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10370 {
	
	public static void main(String[] args) throws IOException,Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
  	R.init(System.in);
  
 
	      int test = sc.nextInt();
	      int[] array;float n;
	   while(test-->0)
	   {
		   n=sc.nextFloat();
		   int sum = 0 ,avg=0;
		   array=new int[(int)n];float result = 0.0f;
		   int count=0;
		   for(int i = 0 ; i <n;i++)
		   {
			   array[i]=sc.nextInt();
			   
			   sum+=array[i];
			   
		   }
		   avg=(int)(sum/n);
		   for(int i = 0 ; i <array.length;i++)
		   {
			   if(array[i]>avg)
			   {
				   count++;
			   }
		   }
		    result = (count / n);
		    
		  float e = result *100;
		    
		   System.out.printf("%.3f",e);
		    System.out.print("%\n");
		   
	   }
	
	
			}
			

			
		
			
		
	
	
}
	
	/*float p1,p2;
	p1=sc.nextFloat();
	p2=sc.nextFloat();
	if(p1==0 && p2!=0){System.out.println("Eixo X");}
	if(p1!=0 && p2==0){System.out.println("Eixo Y");}
	if(p1==0&&p2==0)
	{
		System.out.println("Origem");
	}
	else if(p1>0&&p2<0)
	{
		System.out.println("Q4");
	}
	else if(p1>0&&p2>0)
	{
		System.out.println("Q1");
	}
	else if(p1<0&&p2>0)
	{
		System.out.println("Q2");
	}
	
	else if(p1<0&&p2<0)
	{
		System.out.println("Q3");
	}*/
	
	
	


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
