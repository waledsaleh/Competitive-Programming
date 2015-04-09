package Main;

public class TC_327_Basic_DP {

	public static void main(String[] args) {

		System.out.println(getLength("|-|---|-|---|-|"));
		
		
		
	}
	static int getLength(String s)
	{
		int max = 0;
		int[] dp = new int[s.length()];
	    dp[0]=1;
		for(int i =1; i < s.length();++i)
		{
			
		dp[i]=1;
	   if(s.charAt(i)!=s.charAt(i-1))dp[i]=dp[i-1]+1;
	   
			max =Math.max(max, dp[i]);
		}
	
		
		
		return max;
		
	}
}
