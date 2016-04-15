package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TCHS_ÚSRM_38_DIV1_500 {
	
  
	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
     System.out.println(getJoshSum(98765));
        
	  
	  
	}
	public static int getJoshSum(int n)
	{
		int sum =0;

		int[] saveFib = new int[100001];
		saveFib[0]=saveFib[1]=1;
	
		for(int i =2 ; i <saveFib.length; ++i)saveFib[i]= (saveFib[i-1]+saveFib[i-2])%10;
		
		for(int i = 0; i < n ; ++i)sum +=saveFib[i];
				
		return sum;
		
	}
	
	
	
		
}
