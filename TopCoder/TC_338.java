package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class TC_338 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
         
           PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
           
       StringBuilder sb = new StringBuilder("");
         
       System.out.println(plusOne("11"));
       
       
	
	}
	public static String plusOne(String x)
	{
	    int dec = Integer.parseInt(x, 2);
		dec++;
	    String q  = Integer.toBinaryString(dec);
		return q;
		
	}
	
	
}
