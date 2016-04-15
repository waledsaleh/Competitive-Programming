package Main;
import java.util.*;
import java.math.*;
import java.text.*;

public class TC_684 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println(count("abacaba",3));
		
		
	}
	
	public static int count(String s, int k){
	 
		int res=0;int[] occ = new int[26];
		for(char ch : s.toCharArray())occ[ch-'a']++;
		 
		while(k>0){
			Arrays.sort(occ);
				occ[25]--;
				k--;
			}
				
		for(int i=0;i<occ.length;++i)res +=(Math.pow(occ[i], 2));
		
		
	    return res;
	  }
  

}
