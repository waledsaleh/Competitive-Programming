package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SPOJ_511 {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	StringTokenizer sk ;
	
	
	int test = Integer.parseInt(br.readLine());
	
	     StringBuilder sb = new StringBuilder("");
	    while(test-->0)
	    {
	    	
	    	int sum =0;
	    	
	    	int n = Integer.parseInt(br.readLine());
	    	String[] s = new String[n];
	    	
	    	for(int i = 0 ; i <n;++i)s[i]=br.readLine();
	    	
	    	int count =0;
	    	qsort(s,0,s.length-1);
	    	for(int i = 0 ; i<n;++i)System.out.println(s[i]);
	    		
	    	
	    }
	//System.out.print(sb);
	
	}
	
	
static void qsort(String[]strings,int low, int high) {
    int i = low, j = high;

    // Get the pivot element
    int pivot = low + (high - low) / 2;
    String value = strings[pivot];

    // Divide into two lists
    while (i <= j) {

        while (strings[i].compareTo(value) < 0) {
            i++;
        }

        while (strings[j].compareTo(value) > 0) {
            j--;
        }

        if (i <= j) {
            exchange(strings,i, j);
            i++;
            j--;
        }
    }

    // Recursion
    if (low < j) {
        qsort(strings,low, j);
    }
    if (i < high) {
        qsort(strings,i, high);
    }
}

static void exchange(String[]strings ,int i, int j) {
    String temp = strings[i];
    strings[i] = strings[j];
    strings[j] = temp;
}

}
