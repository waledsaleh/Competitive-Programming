package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Vector;

public class UVA_12543 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String max ="";
		char line=' ';
				boolean f=false;
				StringBuilder sb = new StringBuilder("");
		while(true)
		{
				line = (char)br.read();
				
		       if(Character.isLowerCase(line)||Character.isUpperCase(line))sb.append(line);
		       else if(line=='-')sb.append(line);
		       else
		       {
		    	if(sb.length()>max.length())max = sb.toString();
		    	sb = new StringBuilder("");
		    	
		    		
		       }
		if(sb.toString().equals("E-N-D"))break;
				
		}	
		System.out.println(max.toLowerCase());
		
	}

}
