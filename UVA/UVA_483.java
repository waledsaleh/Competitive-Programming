package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UVA_483 {
	

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
      String line;
      while((line=br.readLine())!=null)
      {
    	  String[] split = line.split(" ");
    	  for(int i = 0 ; i < split.length;++i)split[i]=new StringBuilder(split[i]).reverse().toString();
    	  for(int i = 0 ; i < split.length;++i)
    	  {
    		  if(i==0)System.out.print(split[i]);
    		  else
    			  System.out.print(" "+split[i]);
    	  }
    	  System.out.println();
      }
        
    
        }
  
}
