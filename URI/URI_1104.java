package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Vector;

public class URI_1104 {

	public static void main(String[] args) throws IOException {
       
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder("");
    while(true)
    {
    	int count =0;
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n1 = Integer.parseInt(st.nextToken()),n2=Integer.parseInt(st.nextToken());
    	if(n1==0&&n2==0)break;
    	
    	HashSet<Integer>set1 = new HashSet<Integer>();
    	HashSet<Integer>set2 = new HashSet<Integer>();
     st = new StringTokenizer(br.readLine());
    	
    	
    	for(int i = 0 ; i <n1;++i)set1.add(Integer.parseInt(st.nextToken()));
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0 ; i <n2;++i)set2.add(Integer.parseInt(st.nextToken()));
    	
    	
    	Vector<Integer>v1 = new Vector<Integer>(set1);
    	Vector<Integer>v2 = new Vector<Integer>(set2);
    	Collections.sort(v1);
    	Collections.sort(v2);
    	if(v1.size()>=v2.size())
    	{
    		
    		for(int i = 0 ; i < v2.size() ;++i)
    		{
    			int index = Collections.binarySearch(v1, v2.elementAt(i));
    			if(index <=-1)
    				count++;
    			
    		}
    	}
    	else 
    	{
    		for(int i = 0 ; i < v1.size() ;++i)
    		{
    			int index = Collections.binarySearch(v2, v1.elementAt(i));
    			if(index <=-1)
    				count++;
    		}
    	}
    	sb.append(count+"\n");
    	
    }
    System.out.print(sb);
    
	}
 
}
