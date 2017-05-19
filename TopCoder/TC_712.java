package Main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class TC_712 {
	
   
	public static void main(String[] args)throws IOException {
		
	       System.out.println(compare(5,9,555555555, 1));
		   
		   
		   
	}
	public static String compare(int x1, int k1, int x2, int k2)
	{
		BigInteger X1=new BigInteger(repeat(new StringBuilder(""+x1),k1-1,x1)), 
				X2=new BigInteger(repeat(new StringBuilder(""+x2),k2-1,x2));
		
	
		return X1.compareTo(X2)<0 ? "Less": X1.compareTo(X2) > 0 ? "Greater":"Equal";
	}
	public static String repeat(StringBuilder sb,int k, int x){
	while(k-->0){
	sb.append(x);
	
	}
	
	return sb.toString();
	}
	
}

