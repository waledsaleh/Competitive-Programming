package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class CF_441A{

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
	 int n = Integer.parseInt(line[0]),k= Integer.parseInt(line[1]);
	    boolean f = false;int curr=0,count=1;
	    String res= "";
	 while(n-->0)
	 {
		 line = br.readLine().split(" ");
		 int i = Integer.parseInt(line[0]);
		 
		 for(int j = 1; j <line.length;++j)
		 {
			 int m =Integer.parseInt(line[j]);
			 if(k>m)
			 {
				 f=true;curr++;
				 res +=(count+" ");break;
			 }
			 
		 }
		 count++;
	 }
	 
	    if(!f)System.out.println(0);
	    else{
	    	System.out.println(curr);
	    	System.out.println(res);
	    	
	    }
	}

}
