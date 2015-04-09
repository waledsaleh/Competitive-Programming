package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_381A {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int n=sc.nextInt();
	int[] array = new int[n];
	for(int i = 0 ; i <n;++i )array[i]=sc.nextInt();
	
	boolean f = true;
	
	int first = 0 ;int last = n-1;
	int serja=0,dima=0;
	while(first<=last)
	{
		if(f)
		{
			if(array[first]>array[last])
			{
				serja+= array[first];
				first++;
				
			}
			else
			{
				serja +=array[last];
				last--;
				
			}
			f=false;
		}
		else
		{
			if(array[first]>array[last])
			{
				dima += array[first];
				first++;
				
			}
			
			else
			{
				dima +=array[last];
				last--;
				
			}
			f=true;
		}
		
		
	}
	System.out.println(serja+" "+dima);

}
	
	
}