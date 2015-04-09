package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
//11875 - Brick Game uva
public class UVA_11875 {
	
	public static void main(String[] args) throws IOException {

	Reader.init(System.in);
	
	//Scanner sc = new Scanner(System.in);
	int test=Reader.nextInt();
	for(int i = 1 ; i <=test;i++)
	{
	int n = Reader.nextInt();int med=0;
	int[] array = new int[n];
	int count=1;
	for(int j = 0 ; j <array.length;j++)
	{
		array[j]=Reader.nextInt();
	}
	
	Arrays.sort(array);
	med=array[array.length/2];
	System.out.println("Case "+i+":"+" "+med);
	
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


