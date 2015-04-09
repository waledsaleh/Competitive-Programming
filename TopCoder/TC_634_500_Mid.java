package Main;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TC_634_500_Mid {
   
	
	public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
		
 
  		
	}
	public static  int minValue(int N, int[] s)
	{
	int len = s.length;
	int sum =0;
	for(int i = 0 ; i < len;++i)sum+=s[i];
	
	return Math.max(0, sum-(len-1)*N);
		
		 
	}

}
