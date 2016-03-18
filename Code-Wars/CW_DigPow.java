package Main;

public class CW_DigPow {
	
	//Link: http://www.codewars.com/kata/5552101f47fc5178b1000050/train/java
	
	
	public static long digPow(int n, int p) {
	  int count =((int)Math.log10(n)+1+p)-1,rem=0,oldN=n;long res=0;
	    while(n != 0 ){
	    	rem = n%10;
	    	res += (long) Math.pow(rem, count);
	    	n /= 10;
	    	count--;
	    	
	    }
		
	    return (res % oldN == 0 ? res / oldN : -1);
	}
	
}