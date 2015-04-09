package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class URI_1199 {

	public static void main(String[] args) throws IOException {

	     
	    Scanner sc = new Scanner(System.in);
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    while(true)
	    {
	        String n =br.readLine();
	        if(n.charAt(0)=='-')break;
	        int index = n.indexOf('x');
	        if(index==-1)
	        {
	            String num = Integer.toHexString(Integer.parseInt(n));
	            System.out.println("0x"+num.toUpperCase());
	             
	        }
	        else
	        {
	            String sub = n.substring(index+1,n.length());
	            long dec = hexa_dec(sub);
	            System.out.println(dec);
	        }
	    }
	     
	    }
	  public static long hexa_dec(String e)
	  {
	      long res =0;
	      int count =0;
	      for(int i = e.length()-1;i>=0;i--)
	      {
	          if(e.charAt(i)>='A'&&e.charAt(i)<='F')
	          {
	              res +=((e.charAt(i)-'A')+10)*Math.pow(16, count);
	          }
	          else  if(e.charAt(i)>='a'&&e.charAt(i)<='f')
	          {
	              res +=((e.charAt(i)-'a')+10)*Math.pow(16, count);
	          }
	          else
	          res +=(e.charAt(i)-'0')*Math.pow(16, count);
	           
	          count++;
	           
	      }
	      return res;
	  }
	 
	  
	}