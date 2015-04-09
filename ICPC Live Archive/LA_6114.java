package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LA_6114 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);
            
              int test =Integer.parseInt(br.readLine());
              while(test-->0)
              {
            	  int k =Integer.parseInt(br.readLine());// sc.nextInt();
            	  String[] string = new String[k];
            	  
            	  for(int i = 0 ; i < k ; ++i)string[i]=br.readLine();
            	  
            	  List<String>list = new ArrayList<String>();
            	  
            	  for(int i = 0 ; i < string.length;++i)
            	  {
            		  for(int j = 0 ; j < string.length;++j)
            		  {
            			  if(j==i)continue;
            			  
            			  String con = string[i]+""+string[j];
            			  if(palin(con))
            			  {
            				  list.add(con);
            			  }
            			  
            			  
            		  }
            		  
            	  }
            	  if(list.size()>=1)System.out.println(list.get(0));
            	  else
            		  System.out.println(0);
              }
              
	}
	public static boolean palin(String s)
	{
		int low= 0 ;
		int high = s.length()-1;
		while(low <=high)
		{
			if(s.charAt(low)!=s.charAt(high))return false;
			
			low++;
			high--;
		}
		
		return true;
	}
}
