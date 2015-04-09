package Main;

import java.util.Scanner;

public class CF_510A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
    int n = sc.nextInt();
    int m =sc.nextInt();
    char[][] ch = new char[n][m];
    boolean c= false,c2=false;
    int e = m;
    for(int i = 0 ; i < n ;++i)
    {
    	for(int j = 0 ; j < e ;++j)
    	{
    		if(i%2 !=0)
    		{
    			if(!c)
    			{
    				ch[i][m-1]='#';
    				for(int k = 0 ; k <m-1 ;++k)ch[i][k]='.';
    				c=true;
    				break;
    			}
    			else
    			{
    				ch[i][0]='#';
    				for(int k = 1 ; k <m ;++k)ch[i][k]='.';
    				c=false;
    				break;
    				
    			}
    		}
    		else
    			ch[i][j]='#';
    	}
    }
    for(int i = 0 ; i < n ;++i)
    {
    	for(int j = 0 ; j < m ;++j)
    	{
    	System.out.print(ch[i][j]);	
    	}
    	System.out.println();
    }
		 
	}

}
