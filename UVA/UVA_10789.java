package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_10789 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	StringBuffer sb = new StringBuffer("");
	
	String m="";
   // boolean [] notprimes=sievePrime(2000);
    int cases=Integer.parseInt(br.readLine());
    for(int i=0;i<cases;i++) {
        int[] arr=new int[128];
     // sb  = new StringBuffer("");
        m=br.readLine();
        for(int j=0;j<m.length();j++){
             arr[m.charAt(j)]++;// add frequency of number in ASCII code in array
        }
        boolean flag=true;
        sb.append("Case ").append((i+1)).append(": ");
        
        for(int j=0;j<arr.length;j++){
             if(prime(arr[j]))
             {
                 sb.append((char)j);
                 flag=false;
             }
        }
        if(flag)
            sb.append("empty");
        sb.append("\n");
    }
    System.out.print(sb);
}


	public static boolean prime (int n) // prime numbers
	{
		if(n==1)return false;
		if(n==0)return false;
		for(int i = 2 ; i * i<=n;++i)
		{
			if(n%i==0)return false;
		}
		return true;
	}
	

}

