package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class TCHS_SRM_34_Div1 {

	public static void main(String[] args) throws Exception {

		System.out.println(bestQuote(new String[]
				{"4 1 firstquote","10 2 secondquote","1 5 thirdquote"}));
		
		
	
	}
static String bestQuote(String[] quotes)
{    
         int maxVote =0;
         String maxQuote="";
         for(String j : quotes)
         {
        	 String[] split = j.split(" ");
        	 if(Integer.parseInt(split[0])+Integer.parseInt(split[1])>maxVote)
        	 {
        		 maxVote=Integer.parseInt(split[0])+Integer.parseInt(split[1]);
        		 maxQuote=split[2];
        	 }
         }
	        return maxQuote;
	        
}



}
