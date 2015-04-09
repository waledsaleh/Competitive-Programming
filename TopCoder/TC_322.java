package Main;

import java.io.IOException;
import java.util.Vector;

public class TC_322 {
	public static void main(String[] args) throws IOException {

		int[] a = derSeq(new int[]{5,6,3,9,-1},1);
	for(Integer k : a)System.out.print(k+" ");
		
	}
	
	static int[] derSeq(int[] a, int n)
 	{
      if(n==0||a.length==1)return a;
      
      int [] b = new int[a.length-1];
      for(int i = 1 ; i < a.length;++i)b[i-1]=a[i]-a[i-1];
 		
     
 		return derSeq(b,n-1);
	}

}
