package Main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;
public class UVA_484 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		  Map<Integer,Integer>map  = new HashMap<Integer,Integer>();
    LinkedHashSet<Integer>set = new LinkedHashSet<Integer>();
      String line;
      while((line=br.readLine())!=null)
      {
    	  StringTokenizer st  = new StringTokenizer(line);
    	 
    	 
    	 
    	  int n = st.countTokens();
    	  for(int i = 0; i <n;++i){
    		  int num = Integer.parseInt(st.nextToken());
    		  if(!map.containsKey(num))map.put(num, 1);
    		  else
    			  map.put(num, map.get(num)+1); 
    		  
    		  set.add(num);
    	  }
    	  
    	   
    	  
    	  
    	  
      }
				 
		
		Vector<Integer>v = new Vector<Integer>(set);
		  for(int i = 0 ;i < v.size();++i)
    	   {
    		   System.out.println(v.elementAt(i)+" "+map.get(v.elementAt(i)));
    		   
    		   
    	   }
    	   
    	   
    	   
		
	}

}
