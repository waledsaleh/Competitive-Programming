package Main;

public class TC_652_500 {

	public static void main(String[] args) {

		
	}
	static long findMin(int N)
	{
		long res = 1;
		for(int i = 2; i <=N;++i)res = lcm(res,i);
		
		return res;
	}
	static long gcd(long a, long b)
	{
		if(b==0)return a+b;
		return gcd(b,a%b);
	}
	static long lcm(long a, long b)
	{
		
		return (a*b)/gcd(a,b);
	}
}
