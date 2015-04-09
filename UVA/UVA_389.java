package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_389{

	
	
public static void main (String [] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    Scanner sc = new Scanner(System.in);
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringBuilder sb = new StringBuilder("");
	   
	    String word;
	    while((word=br.readLine())!=null)
	    	
	    {
	    	StringTokenizer st = new StringTokenizer(word);
	    	
	    	String number = st.nextToken();
	    	StringBuilder sb2 = new StringBuilder("");
	    	
	    	int base = Integer.parseInt(st.nextToken());
	    	
	    	int t = Integer.parseInt(st.nextToken());
	    
	    	BigInteger bg = new BigInteger(number,base);
	    	
	    	String res = bg.toString(t).toUpperCase();
	    	
	    	sb2.append(res);
	    	
    		for(int i = res.length(); i <7;++i)sb2.insert(0, ' ');//(" ");
    		
	    	if(sb2.length()>7)
	    	{
                
	    		sb.append("  ERROR\n");
	    		
	    	}
	    	else
	    	{
	    		
	    		sb.append(sb2+"\n");
	    		
	    		
	    	}
	    
	    }
	    System.out.print(sb);
	   // bw.flush();
	    //bw.close();
}

}
