package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class LA_4088 {
 
static int _sieve_size;
static boolean[] bs;
static List<Integer> primes = new ArrayList<Integer>();
 
public static void main(String[] args) throws IOException {
 
Scanner sc = new Scanner(System.in);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
sieve(1000001);
int[] isprime = new int[bs.length];
for(int i = 0 ; i <bs.length;++i)isprime[i]=(bs[i]?1:0);
for(int i = 2 ; i <isprime.length;++i)isprime[i]=isprime[i]+isprime[i-1];
 
long[] res = new long[1000001];
res[2]=1;
for(int i = 3 ;i<res.length;++i)if((bs[i] && (i-1)%4==0))res[i]=1;
 
for(int i = 1 ; i <res.length;++i)res[i]=res[i]+res[i-1];
 
while(true)
{
 
int l =sc.nextInt();
int r =sc.nextInt();//Integer.parseInt(st.nextToken());
if(l==-1&&r==-1)break;
int L=l;
int R=r;
l = Math.max(l, 1);
r = Math.max(r, 1);
 
long x=isprime[r]-isprime[l-1];
System.out.print(L+" "+R+" "+x+" "+(res[r]-res[l-1])+"\n");
 
 
}
 
 
}
 
 
public static void sieve(int upperbound) { // create list of primes in [0..upperbound]
_sieve_size = upperbound + 1; // add 1 to include upperbound
bs = new boolean[_sieve_size];
Arrays.fill(bs,true); // set all bits to 1
bs[0] = bs[1] = false; // except index 0 and 1
for (long i = 2; i < _sieve_size; i++) if (bs[(int)i]) {
// cross out multiples of i starting from i * i!
for (long j = i * i; j < _sieve_size; j += i) bs[(int)j] = false;
primes.add((int)i); // also add this vector containing list of primes
}
 
}
}