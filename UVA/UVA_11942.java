package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//11942 - Lumberjack Sequencing uva

public class UVA_11942 {
	enum Direction {undef, up, down}; 
	 public static void main(String[] args) throws Exception {  
        Reader.init(System.in);  
        //Reader.init(new FileInputStream(new File("input.in")));  
        int noOfTestCases = Reader.nextInt();  
        System.out.println("Lumberjacks:");  
        for(int i = 1; i <= noOfTestCases; i++) {  
             Direction dir = Direction.undef;  
             int previousVal;  
             int currentVal;  
             int j = 0;  
             boolean ordered = true;  
             previousVal = Reader.nextInt();  
             while(dir == Direction.undef && j < 9) {  
                  currentVal = Reader.nextInt();  
                  if(previousVal > currentVal) dir = Direction.down;  
                  else if(previousVal < currentVal) dir = Direction.up;  
                  j++;  
                  previousVal = currentVal;  
                  //System.out.println("DEBUG: Testcase " + i + "Dir: " + dir.toString() );  
             }  
             for(; j < 9; j++) {  
                  currentVal = Reader.nextInt();  
                  if(dir == Direction.down) {  
                       //System.out.println("DEBUG: currJack: " + j + "Dir: " + dir.toString() + " curVal:" + currentVal + " prevVal:" + previousVal);  
                       if(previousVal < currentVal) ordered = false;  
                  } else if (dir == Direction.up) {  
                       if(previousVal > currentVal) ordered = false;  
                  }  
                  previousVal = currentVal;  
             }  
             if(ordered) System.out.println("Ordered");  
             else System.out.println("Unordered");  
        }  
   }  
}  

/** Class for buffered reading int and double values */
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