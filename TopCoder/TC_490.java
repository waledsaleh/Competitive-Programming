package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_490{
	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
Scanner sc  = new Scanner(System.in);
	
    String[] mom ={"07:11", "05:00", "04:40", "14:25"};
    		System.out.println(countLuckyMoments(mom));


	}
	
	
	public static int countLuckyMoments(String[] moments)
	{
		//"12:21"
		// AB:AB, AA:BB or AB:BA, 
	     int count =0;
	     int c = 0;
	     for(int i = 0 ; i < moments.length;++i)
	     {
	    	
	    		 if(moments[i].charAt(0)==moments[i].charAt(3)&&moments[i].charAt(1)==moments[i].charAt(4)||
	    				 moments[i].charAt(0)==moments[i].charAt(1)&&moments[i].charAt(3)==moments[i].charAt(4)||
	    				 moments[i].charAt(0)==moments[i].charAt(4)&&moments[i].charAt(1)==moments[i].charAt(3))
	    		 {
	    		 count++;
	    	 
	    		 }
	    		 
	     }
		return count;
		
	}
	
	
}
