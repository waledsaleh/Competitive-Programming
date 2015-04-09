package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class UVA_11371 {
    
	public static void main(String[] args) throws IOException {

		Scanner sc= new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		String line;
		while((line=br.readLine())!=null)
		{
	    char[] ch = line.toCharArray();
	    Arrays.sort(ch);
	    String first = "";
	    for(int i = 0 ; i < ch.length;++i)first +=ch[i];
	  
	    String sec = new StringBuilder(first).reverse().toString();
	    
	    long max,min=0;
	    		
	    for(int i = 0 ; i < ch.length;++i)
	    {
	    	if(ch[i]!='0')
	    	{
	    		char temp = ch[0];
	    		ch[0]=ch[i];
	    		ch[i]=temp;
	    		break;
	    	}
	    	
	    }
	    first="";
	    for(int i = 0 ; i < ch.length;++i)first +=ch[i];
	    
	    	min = Long.parseLong(first);
	    	max = Long.parseLong(sec);
	    	//System.out.println(max+" - "+min+" = "+(max-min)+" = 9 * "+(max-min)/9);
		
		sb.append(max+" - "+min+" = "+(max-min)+" = 9 * "+(max-min)/9+"\n");
		
		}
		
		System.out.print(sb);
	}
	
	
}
