package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TC_442_500 {
	
	public static void main(String[] args) throws IOException {

		System.out.println(howMany(2,100000));
		
	}
	static int howMany(int A, int B)
	{
		
		int count =0;
		
		for(int i = A ;i<=B;++i)
		{
			
			if(prime(work(i)))count++;
		}
		return count;
	}
	public static boolean prime(int a)
	{
		//if(a%2==0)return false;
		if(a==1||a%2==0||a==2)return false;
		
		for(int i = 3 ; i<=(int)Math.sqrt(a);i+=2)if(a%i==0)return false;
		
		return true;
	}
	public static int work(int n) // prime factorization
	{
			int len =0;
			for(int i = 2 ; i*i<=n;i++)
			{
				while(n%i==0)
				{
					len++;
					n/=i;
					
				}
			}
			
			if(n>1)
				len++;
		
			
return len;
		  
		  }

			
}
