package Main;

import java.util.Scanner;

public class CF_445A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n =sc.nextInt();
		 int m =sc.nextInt();
		
		 	char[][]ch = new char[n][m];
		 
		 	for(int i = 0 ; i < n ; ++i){String q =sc.next();for(int j = 0 ; j <q.length();++j)ch[i][j]=q.charAt(j);}
		  
		 	char[][]res = new char[n][m];
		 
		 	for(int i = 0 ; i < n;++i)
	    	{
	    		for(int j = 0 ; j < m ; ++j)
	    		{
	    		   if(ch[i][j]=='-')res[i][j]='-';
	    		   else  if(ch[i][j]=='.')
	    		   {
	    			  if(i%2==0)
	    			  {
	    				  if(j%2==0)
	    					  res[i][j]='B';
	    				
	    				  else
	    					  res[i][j]='W';
	    					
	    			  }
	    			  else
	    			  {
	    				  if(j%2==0)
	    					  res[i][j]='W';
	    				
	    				  else
	    					  res[i][j]='B';
	    				  
	    			  }
	    		   }
	    			
	    		}
	    			
	    	}
		 	for(int i = 0 ; i < n;++i)
	    	{
	    		for(int j = 0 ; j < m ; ++j)
	    		{
	    	      System.out.print(res[i][j]);
	    	      
	    		}
	    		System.out.println();
	    	}

	}

}
