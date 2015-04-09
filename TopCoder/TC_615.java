package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class TC_615 {

	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
		  
       int[] a = {817,832,817,832,126,817,63,63,126,817,832,287,823,817,574};
       System.out.println(simulate(a,63));
        		 
        		
	}
	public static int simulate(int[] X, int A)
	{
		int res =A;
		//Arrays.sort(X);
		
		for(int i = 0 ; i < X.length;++i)
		{
			//if(X[i]>res) continue;
			if(X[i]==res)res +=X[i];
		}
		//if(res==0)return A;
		
		return res;
	}
	
}
