package Main;

public class TC_449_500 {

	public static void main(String[] args) {

		
		System.out.println(findSum(999999999));
		
		
	}
	// if n is even , so f(n-1/2)
	static long findSum(int N)
	{
		if(N==0) return 0;
		return (long)((N+1)>>1)*((N+1)>>1)+findSum((int)N>>1);
		
	}
	
}
