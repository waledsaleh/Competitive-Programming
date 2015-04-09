package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_16A {

	public static void main(String[] args) throws IOException {

	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	 int n =sc.nextInt();
	 int m =sc.nextInt();
	
	 	char[][]ch = new char[n][m];
	 
	 	for(int i = 0 ; i < n ; ++i){String q =sc.next();	for(int j = 0 ; j <q.length();++j)ch[i][j]=q.charAt(j);}
	 
	 	 if(n==1&&m==1){System.out.println("YES");return ;}
	 	if(check(ch,n,m))System.out.println("YES");
	 	else
	 		System.out.println("NO");
	 	
	 
		
	}
    public static boolean check(char[][]ch,int n , int m)
    {
    	for(int i = 0 ; i < n;++i)
    	{
    		for(int j = 1 ; j < m ; ++j)
    		{
    			if(ch[i][j]!=ch[i][j-1])return false;
    		}
    			
    	}
    	for(int i = 0 ; i < m;++i)
    	{
    		char[]a = new char[n];
    		for(int j = 0 ; j < n ; ++j)
    		{
    			a[j]=ch[j][i];
    		}
    			for(int k = 1 ; k <a.length;++k)
    			{
    				if(a[k]==a[k-1])return false;
    			}
    	}
    	return true;
    	
    }
    
}
