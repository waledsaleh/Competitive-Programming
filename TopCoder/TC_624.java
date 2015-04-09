package Main;

import java.util.*;
import java.io.*;
import java.text.*;

public class TC_624 {
	
	public static void main(String[] args)throws IOException {

		
		
		
				
		
	}
	
	
		static int minimum(int K, int[] danceCost)
		{	
			 int sum =0;
			 Arrays.sort(danceCost);
			 for(int i = 0 ; i <K;++i)sum +=danceCost[i];
			 
			 
			 return sum;
		}
				
			
				
}
