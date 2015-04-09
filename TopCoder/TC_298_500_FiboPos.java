package Main;

import java.util.Scanner;

public class TC_298_500_FiboPos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
	        System.out.println(fibIndex(13));
		
	}
	
	static double fibIndex(long n)
	{
		int a=1,b=2,i=2; //a and b are cosecutive fibonacci numbers, i is the index of a
		while(n>b) { //n is outside [a,b] interval
		 b=b+a; // a little trick to get next pair of fibonacci's without aux variable
		 a=b-a; // since b here equals oldB+oldA, a = b-a = oldB+oldA-oldA = oldB
		 i++;
		}
		return ((double)i)+((double)(n-a))/((double)(b-a));
	}
	
	
	
}
