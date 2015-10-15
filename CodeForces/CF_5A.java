package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class CF_5A{

	public static void main(String[] args) throws  IOException {

		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		   String line;
		   Map<String,String>m = new HashMap<String,String>();
		   int res = 0 ;
            while((line=br.readLine())!=null)
            {
	                if(line.charAt(0)=='+')m.put(line.substring(1), "");                 
	                else if(line.charAt(0)=='-')m.remove(line.substring(1));
	                else if(line.contains(":"))
	                {
	                	String left= line.substring(0,line.indexOf(":"));
	                	String right = line.substring(line.indexOf(":")+1);
	                	m.put(left, right);
	            
	                	res +=right.length()*m.size();
	                	
	                }
	                                    
            }
		 System.out.println(res);
		
		
	}
	
	 

}
