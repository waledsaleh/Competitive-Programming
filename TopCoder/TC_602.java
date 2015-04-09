package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TC_602 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new FileReader("all3.txt"));
		
		System.out.println(count(new int[]	

				

				{575,1090,3271,2496,859,2708,3774,2796,1616,2552,3783,2435,1111,526,562}));
		
		
	}

	static int count(int[] rating)
	{
		int f = 500;
		int c= 0;
		boolean c1=false,c2=true;
		for(int i = 0 ; i <rating.length;++i)
		{
			if( rating[i] >= 1200 && !c1 && rating[i]>f)
			{
				f=rating[i];
				c++;
				c1=true;
				c2 =false;
			}
			else if ( rating[i] < 1200 && !c2 && rating[i]<f)
			{
				f = rating[i];
				c++;
				c1= false;
				c2= true;
			}
		}
		return c;
	}
}
