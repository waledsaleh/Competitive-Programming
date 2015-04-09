package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_315 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
      
         
	}
	public static int getScore(int[] dice)
	{
		int sum =0;
		//with 1 dot has 0 petals, the face with 2 dots has 0 petals, the face with 3 dots has 2 petals,
		//the face with 4 dots has 0 petals,
		//the face with 5 dots has 4 petals and finally the face with 6 dots has 0 petals
		for(int i = 0 ; i <dice.length;++i)
		{
			if(dice[i]==3)sum +=2;
			else if(dice[i]==5)sum+=4;
	
			
		}
		
		return sum;
	}
}
