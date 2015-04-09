package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_208 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
        
         String [] a={"AAAAAAAA",
        		 "ABWBWBWA",
        		 "AWBWBWBA",
        		 "ABWBWBWA",
        		 "AWBWBWBA",
        		 "AAAAAAAA"};
         
         System.out.println(count("BW",a));
	}
	public static int count(String dithered, String[] screen)
	{
		int count =0;
		for(int i = 0 ; i <dithered.length();++i)
		{
			char ch = dithered.charAt(i);
			for(int q  = 0 ; q < screen.length;++q)
			{
			for(int j = 0 ; j <screen[q].length();++j)
			{
				if(screen[q].charAt(j)==ch)count++;
			}
			
			}
		}
		return count;
	}
}
