package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UVA_10394 {
      static int _sieve_size;
	  static boolean[] bs;   // 10^7 should be enough for most cases
	  static List<Long> primes = new ArrayList<Long>();   // compact list of primes in form of vector<int>

	public static void main(String[] args) {

		sieve(20000001);
		Scanner sc = new Scanner(System.in);
		List<String>twin = new ArrayList<String>();
		twin.add("(3, 5)");
		for(long j :primes)
		{
			if(bs[(int) j])
			{
				if(bs[(int) (j+2)])
				{
					//(3, 5)
					twin.add("("+j+", "+(j+2)+")");
				}
			}
		}
		
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			
			System.out.println(twin.get(n));
			
		}
		
	}

	
	  // first part

	 static void sieve(int upperbound) {          // create list of primes in [0..upperbound]
	    _sieve_size = upperbound + 1;                   // add 1 to include upperbound
	    bs = new boolean[_sieve_size];
	    Arrays.fill(bs,true);                                    // set all bits to 1
	    bs[0] = bs[1] = false;                                     // except index 0 and 1
	    for (long i = 2; i < _sieve_size; i++) if (bs[(int)i]) {
	      // cross out multiples of i starting from i * i!
	      for (long j = i * i; j < _sieve_size; j += i) bs[(int)j] = false;
	      primes.add(i);  // also add this vector containing list of primes
	  } }     
}
