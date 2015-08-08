package Main;

import java.util.Scanner;
import java.util.Vector;

public class CF_550B_BitMasks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt(),r=sc.nextInt(),x=sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i <n ;++i)a[i]=sc.nextInt();
		
		int count =0;
      for(int i = 0; i < (1<<n); i++){
    	  if(Integer.bitCount(i) <= 1)continue;
			
			int max = 0;
			int min = Integer.MAX_VALUE;
		    int sum =0;
		    Vector<Integer>v = new Vector<Integer>();
		    for(int j = 0; j < n; j++){
		    	 if((i&1<<j) > 0){ 
		    		 
			           sum +=a[j];
			           v.add(a[j]);
			           min = Math.min(min, a[j]);
						max = Math.max(max, a[j]);
			        }
		    	
		    }
		    if(max-min >= x && l <= sum && sum <= r){
				count++;
			}
	}

System.out.println(count);

	}
}
