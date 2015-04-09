package Main;

import java.util.Scanner;

public class CF_448D {
 static long n;
static long m;
static long k;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 n = sc.nextLong();
		 m = sc.nextLong();
		 k =sc.nextLong();
		
		long l = 1 ,r = n*m+1;
		// Binary search
		while(l <r)
		{
			long m = l+r >>1;
			if(cal(m)<k)l = m+1;
			else
				r =m;
			
		}
		System.out.println(l);
	}

public static long  cal(long  a) {
	long ret = 0;
	for (int i = 1; i <= n; ++i) {
		ret += Math.min(a / i, m);
	}
	return ret;
}


}
