package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class UVA_11185 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	StringBuilder sb = new StringBuilder("");
	
	String m="";
	
	
	while(true)
	{
		 m = br.readLine();
		if(Integer.parseInt(m)<0)break;
		sb.append((Integer.toString(Integer.parseInt(m), 3))).append("\n");
		
		
	}
	System.out.print(sb);
	}
	
}
