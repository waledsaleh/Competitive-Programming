package Main;

public class TC_335_500_Nor {

	public static void main(String[] args) {
		
 System.out.println(get(100,1000));
 
 
 
	}
	
	static long get(long G, long L)
	{
		if(L%G !=0)return -1;
		
		long div =L/G;
	     
		long min = Long.MAX_VALUE;
		for(long i = 1 ;i*i <=div;++i )
		{
			if(div%i==0 && GCD(i,div/i)==1)min = Math.min(min, (i+div/i));
		}
		
		return min*G;
	}
		


	public static long GCD(long g , long lcm)
	{
		if(g==0||lcm==0)return g+lcm;
		return GCD(lcm,g%lcm);
	}

	
	
	
}
