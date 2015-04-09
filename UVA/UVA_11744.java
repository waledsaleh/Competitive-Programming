package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class UVA_11744 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		int t = sc.nextInt();
		while(t-->0)
		{
			String a = sc.next();
			String b=  sc.next();
			System.out.println(a+" "+b);
			
			while(true)
			{
				if(Integer.parseInt(b,2) == 0||Integer.parseInt(b,2)>=Integer.MAX_VALUE)break;
					
				String d="";
				  String c = "";
				  for(int i = 0; i < b.length();++i)
				  {
					  if(a.charAt(i)!=b.charAt(i))c +='1';
					  else
						  c +='0';
				  }
			      System.out.print(c+" ");
			      
			      for(int i = 0; i < b.length();++i)
			      {
			        if(a.charAt(i)=='1'&&b.charAt(i)=='1')d +='1';
			        else
			        	d +='0';
			        
			      }
			      a = c;
			      b = Integer.toString(2*Integer.parseInt(d,2),2);
			    if(Integer.parseInt(b,2)<0||b.charAt(0)=='-')
				{
					System.out.println("overflow");
					break;
				}
			     int  len = Math.abs(b.length()-a.length());
			     
			     for(int i =0; i <len;++i)b ="0"+b;
			     
			      System.out.println(b);
			
			}
			if(t>0)
			System.out.println();
			
		}
	}
 
}
