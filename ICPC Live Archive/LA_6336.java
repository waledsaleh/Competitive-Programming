package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LA_6336 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
		int n;
		int[] array;
	while(true)
	{
		int total=0;
		n=Integer.parseInt(br.readLine());
		if(n==0)break;
		StringTokenizer st = new StringTokenizer(br.readLine());
		array = new int[st.countTokens()];
		
		for(int i = 0 ; i <array.length;++i)array[i]=Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i <array.length;++i)array[i]=(int)Math.pow(array[i], 2);
		
		
		for(int j : array)total+=j;
		
		System.out.println(total);
	}
	
	
	
	}
	
	
}
