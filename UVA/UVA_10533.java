package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UVA_10533 {
	 static int _sieve_size;
	  static boolean[] bs;   // 10^7 should be enough for most cases
	  static List<Integer> primes = new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
     
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int test = Integer.parseInt(br.readLine());
	StringBuilder sb=new StringBuilder("");
	sieve(1000001);
	int[] c = new int[1000001];
	//boolean[] check = new boolean[primes.size()];
	
	for(int i =0 ; i <primes.size();++i )
	{
		int d =Sum(primes.get(i));
		if(bs[d])
		{
			c[primes.get(i)]=1;
		}
	}
	for(int i = 1 ; i<c.length;++i)c[i]=c[i]+c[i-1];
	//StringBuilder sb = new StringBuilder("");
	while(test-->0)
	{
		
	   StringTokenizer st  = new StringTokenizer(br.readLine());
	  int t1 = 	Integer.parseInt(st.nextToken());
	  int t2= Integer.parseInt(st.nextToken());
	 sb.append(c[t2]-c[t1-1]+"\n");
		
	  
	}
	System.out.print(sb);
	
	}
 
  public static int Sum(int n )
  {
	  int rem = 0,sum=0;
	  while(n!=0)
	  {
		  rem = n%10;
		  sum +=rem;
		  n /=10;
		  
	  }
	  return sum;
  }
  
  static void sieve(int upperbound) {          // create list of primes in [0..upperbound]
	    _sieve_size = upperbound + 1;                   // add 1 to include upperbound
	    bs = new boolean[_sieve_size];
	    Arrays.fill(bs,true);                                    // set all bits to 1
	    bs[0] = bs[1] = false;                                     // except index 0 and 1
	    for (long i = 2; i < _sieve_size; i++) if (bs[(int)i]) {
	      // cross out multiples of i starting from i * i!
	      for (long j = i * i; j < _sieve_size; j += i) bs[(int)j] = false;
	      primes.add((int) i);  // also add this vector containing list of primes
	  } }   
}
