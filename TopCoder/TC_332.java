package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_332 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	System.out.println(averageLength(br.readLine()));
	
	
	
	
	}
	
	// Test cases is important
	
	public static double averageLength(String text)
	
	{
		text = text.replaceAll("[\\d,.?!-]", " ");
		String[] s = text.split(" ");
		
		double sum =0;
		double res = 0.0;double count=0.0;
		
		for(int i = 0 ; i <s.length;++i)
		{
			if(s[i].trim().length()>0)
			{
				count++;
			sum+=s[i].trim().length();
			}
			
		}
		res = sum/count;
		if(count==0.0)
		return count;
		else
		return res;
		
	}
	
	
	
}
