package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_11360 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int t=1;
	while(test-->0)
	{
		int n  =Integer.parseInt(br.readLine());
		int array[][]=new int[n][n];
		for(int i = 0 ; i < n ; ++i){
			
			String q = br.readLine();for(int j = 0 ; j < n ; ++j)array[i][j]=Integer.parseInt(""+q.charAt(j));
			
		}
		
		int m = Integer.parseInt(br.readLine());
		while(m-->0)
		{
			String q = br.readLine();
			if(q.equals("transpose"))array=transpose(array);
			
			else if(q.equals("inc"))inc(array);
			else if(q.equals("dec"))dec(array);
			else
			{
				String[]split = q.split(" ");
				if(split[0].equals("row"))change_row(array,Integer.parseInt(split[1]),Integer.parseInt(split[2]));
				
				else
				{
					change_col(array,Integer.parseInt(split[1]),Integer.parseInt(split[2]));
				}
			}
		}
		System.out.println("Case #"+t);
		print(array);
		System.out.println();
		t++;
	}
		
		
	}
	
	public static void change_row(int array[][],int n1 , int n2)
	{
		for(int j=0;j<array.length;++j)
		{
			int temp = array[n1-1][j];
			array[n1-1][j]= array[n2-1][j];
			array[n2-1][j]=temp;
			
		}
		
	}
	public static void change_col(int array[][],int n1 , int n2)
	{
		for(int j=0;j<array.length;++j)
		{
			int temp = array[j][n1-1];
			array[j][n1-1]= array[j][n2-1];
			array[j][n2-1]=temp;
			
		}
		
	}
 public static int[][] transpose(int array[][])
 {
	 int[][]t = new int[array.length][array.length];
     for(int i = 0 ; i < array.length;++i)  
     {
    	 for(int j = 0 ; j < array.length;++j)
    	 {
    	  t[j][i]=array[i][j];
    	 }
    	
    	 
     }
	 return t;
	 
 }
 public static void print (int array[][])
 {
     for(int i = 0 ; i < array.length;++i)  
     {
    	 for(int j = 0 ; j < array.length;++j)
    	 {
    		if(j==array.length-1)System.out.print(array[i][j]);
    		else
    		System.out.print(array[i][j]);
    	 }
    	 System.out.println();
     }
	 
	 
 }
 public static void inc (int array[][])
 {
     for(int i = 0 ; i < array.length;++i)  
     {
    	 
    	 for(int j = 0 ; j < array.length;++j)
    	 {
    		array[i][j]++;
    		if(array[i][j]==10)array[i][j]=0;
    	 }
    	
     }
	 
	 
 }
 
 public static void dec (int array[][])
 {
     for(int i = 0 ; i < array.length;++i)  
     {
    	 
    	 for(int j = 0 ; j < array.length;++j)
    	 {
    		array[i][j]--;
    		if(array[i][j]== -1)array[i][j]=9;
    	 }
    	
     }
	 
	 
 }
 
}
