package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TC_632 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
     int n = 3;
     int[]d = {1,2,3};
     System.out.println(numberOfLap(n,d));
        
        
    
        }
   static int numberOfLap(int N, int[] d)
    {
    	int count =1;
    	for(int i = 0 ; i <d.length-1;++i)
    	{
    		if(d[i]>=d[i+1])
    		{
    			count++;
    		}
    		
    		
    	}
    	
    	return count;
    	
    }
}