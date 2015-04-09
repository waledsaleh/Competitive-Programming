package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UVA_583 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);

              StringBuilder sb = new StringBuilder("");
              while(true)
              {
            	  int n = Integer.parseInt(br.readLine());
            	  if(n==0)break;
            	  
            	  if(n==2147483647)
            	  {
            		  sb.append("2147483647 = 2147483647");
            	  }
            	  else if(n==1)
            	  {
            		  sb.append("1 = 1");
            	  }
            	  else if(n==-1)
            	  {
            		  sb.append("-1 = -1");
            	  }
            		  else if(n == -2147483647){
            		  sb.append("-2147483647 = -1 x 2147483647");
            		  }
            		  else
            		  {
            	  sb.append(n+" = ");
            	  
            	  List<Integer>list =list((int)Math.abs(n));
            	  if(n>0)
            	  {
            		  for(int i = 0 ; i <list.size();++i)
            		  {
            			  if(i==0)sb.append(list.get(i));//System.out.print(list.get(i));
            			  else {
							sb.append(" x "+list.get(i));
            				  //System.out.print(" x "+list.get(i));
						}
            			  
            		  }
            		  
            		  
            	  }
            	  else  if(n<0)
            	  {
            		  sb.append(-1+" x ");
            		 // System.out.print(-1+" x ");
            		  for(int i = 0 ; i <list.size();++i)
            		  {
            			  if(i==0)sb.append(list.get(i));//System.out.print(list.get(i));
            			  else {
            				  sb.append(" x "+list.get(i));
							//System.out.print(" x "+list.get(i));
						}
            			  
            		  }
            		  
            		  
            	  }
            	  
            		  }
            	  sb.append("\n");
            	 // System.out.println();
              }
              System.out.print(sb);
              
	}
	public static List<Integer>list (long n)
	{
		List<Integer>list = new ArrayList<Integer>();
		 
		for(int i = 2 ; i*i<=n;++i)
		{
			while(n%i==0)
			{
				list.add(i);
				n /=i;
			}
			
		}
	  	if(n >1)list.add((int)n);
	  	return list;
	}
	
	
}
