package Main;

import java.util.*;

public class TCHS_SRM_52_DIV1 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
   
        
        System.out.println(getPoints(new int[]{8, 16, 32}, new int[]{10, 10, 5}));
	
	}
 static  int getPoints(int[] rawScores, int[] conversionFactor)
 
 {
   int sum = Math.round((float)rawScores[0]/conversionFactor[0]);
   for(int i =1 ; i <rawScores.length;++i)  sum += Math.round((float)rawScores[i]/conversionFactor[i]);
 
	 return sum;
		
 }
 
 
 
 
}
