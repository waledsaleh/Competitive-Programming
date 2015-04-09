package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TC_500_Div2 {

public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	 System.out.println(printSmiles(100));
		 
}


// prime factor for number and make summation
public static int printSmiles(int smiles)
{
	int x = 2;
	
	int res=0;
	while(smiles>1)
	{
		
		while(smiles%x!=0)
		x++;
		
		res +=x;
		smiles /=x;
		
	}
	return res;
	
}

}
