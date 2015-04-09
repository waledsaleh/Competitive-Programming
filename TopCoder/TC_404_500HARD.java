package Main;

import java.util.HashSet;
import java.util.Scanner;

public class TC_404_500HARD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		
	}
	public String[] calcTriangle(String[] questionMarkTriangle){
	    String[] ret = questionMarkTriangle;
	    int n = ret.length;
	    if (n == 1)
	        return ret;
	    int pos[] = new int[n];
	    char cc[][] = new char[n][n];
	    for (int i = 0; i < n; i++)
	        for (int j = 0; j < ret[i].length(); j++){
	            cc[i][j] = ret[i].charAt(j);
	            if (cc[i][j] != '?')
	                pos[i] = j;
	        }
	    // go through questionMarkTriangle and restore values
	    for (int i = n - 2; i > -1; i--){
	        for (int j = pos[i] + 1; j < n - i; j++)
	            cc[i][j] = (char)((cc[i + 1][j - 1] - cc[i][j - 1] + 10) % 10 + 48);
	        for (int j = pos[i] - 1; j > -1; j--)
	            cc[i][j] = (char)((cc[i + 1][j] - cc[i][j + 1] + 10) % 10 + 48);
	    }
	    for (int i = 0; i < n; i++)
	        ret[i] = new String(cc[i], 0, ret[i].length());
	    return ret;
	}
}
