package Main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class TC_273 {

	public static void main(String[] args) {

		 System.out.println(need(new int[]{9,9,10,10}));
	
	}
 static 	int need(int[] marks) {
	
	  int res = 0;
	  for(int i = 0; i < marks.length;++i)res +=(10-marks[i])*2-1;
	 
	  return Math.max(res, 0);
	}
}
