package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LA_2483 {

	public static void main(String[] args) throws IOException {

	     Scanner sc = new Scanner(System.in);

	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     
	     int tc =1;
	     String line;
	    
	     line = br.readLine();

	     while(!line.equals("#"))
	     {
	    		    	 
	    	 String[] split = line.split(" ");
	    	 int a = Integer.parseInt(split[1]);
	    	 int b = Integer.parseInt(split[2]);
	    	 System.out.println("Set "+tc);
	    	 tc++;
	    	
	    	 while(true)
	    	 {
	    		 long res = 0;
	    		  line = br.readLine();
	    	 
	    	 if(line.charAt(0)=='#'||line.charAt(0)=='C')break;
	    	 long n = Long.parseLong(line);
	    	 
	    	 String binary = Long.toBinaryString(n);
	    	 for(int i = 0 ; i < binary.length();++i)
	    	 {
	    		 if(binary.charAt(i)=='0')res +=a;
	    		 else
	    			 res +=b;
	    	 }
	    	System.out.println(res);
	    	
	    	 }
	    	 
	    	
	    	 
	     }
	}

}
