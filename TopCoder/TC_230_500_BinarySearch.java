package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TC_230_500_BinarySearch {

	public static void main(String[] args) throws IOException {
		
       
		
	}
	static double howMany(int c, int time)
	{
		double lo = 0;
		double hi = 8e8;
		double res = 1.0 * time/c;
		for(int i = 0 ; i <=100;++i)
		{
			double mid = (lo+hi)/2.0;
			double temp = mid*Math.log(mid)/Math.log(2.0);
			if(temp>res)hi = mid;
			else
				lo = mid;
			
			
		}
		return (lo+hi)/2.0;
		
		
		
		
	}
}
