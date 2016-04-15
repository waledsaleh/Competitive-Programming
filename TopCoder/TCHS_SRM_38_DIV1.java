package Main;

public class TCHS_SRM_38_DIV1 {

	public static void main(String[] args) {

		
		
		
		
	}
	public String isJoshString(String s)
	{
		int sum = 0;
		for(int i=0;i<s.length();++i)sum +=(int)(s.charAt(i)-'a') + 1;
		
		return (isprime(sum)?"YES":"NO");
	}
	
	public boolean isprime(int n ){
	
	for(int i =2 ; i*i<=n;++i)if(n%i==0)return false;
	
	return true;
	
	}
}
