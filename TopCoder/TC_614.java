package Main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class TC_614 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
            
         System.out.println(makeMicroString(10,15));
         
                

	}

		  public static  String makeMicroString(int A, int D)
		  {
			  
			  List<Integer>list = new ArrayList<Integer>();
			  
			  list.add(A);
			   String res = "";
			  int n = A;
			  int count = 1;
			  while(n !=0)
			  {
			 
				  list.add(A-count*D);
			  count++;
			  if(list.get(list.size()-1)<0)break;
			  
			  }
			  for(Integer j : list)System.out.print(j+" ");
			  
			  System.out.println();
			  for(int i = 0 ; i <list.size();++i)
			  {
				  if(list.get(i)>=0)
				  res +=list.get(i);
				  
			  }
			
			 System.out.println(list.size());
	
			  return res.trim();
		  }
}
