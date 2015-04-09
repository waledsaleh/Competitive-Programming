package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class UVA_11799 {
	
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		R.init(System.in);
		
		
		int test=R.nextInt();int[] array;int n;
		for(int i = 1 ; i <=test;++i)
		{
			n=R.nextInt();
			array=new int[n];
			for(int j =0;j<n;++j)
			{
				array[j]=R.nextInt();
				
			}
			Arrays.sort(array);
			System.out.println("Case "+i+": "+array[array.length-1]);
			
		}
		
	}
	

}
