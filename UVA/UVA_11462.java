package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class UVA_11462  {

	
	public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		while(true)
		{
		int n=Integer.parseInt(br.readLine());
		if(n==0)break;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] array = new int[n];
		for(int i = 0 ; i < n ; ++i)array[i]=Integer.parseInt(st.nextToken());
		
		qsort(array,0,n-1);
		
		for(int i = 0 ; i <n ; ++i)
		{
			if(i!=n-1)
			bw.write(array[i]+" ");
			else
				bw.write(array[i]+"\n");
		}
		
		}
		bw.flush();
		//bw.close();
	}
	
	
public static void qsort(int[]numbers,int low, int high) {
    int i = low, j = high;
   int count =0;
    // Get the pivot element
    int pivot = low + (high - low) / 2;
    int value = numbers[pivot];

    // Divide into two lists
    while (i <= j) {

        while (numbers[i] < value) {
            i++;
        }

        while (numbers[j] > value) {
            j--;
        }

        if (i <= j) {
            exchange(numbers,i, j);
            i++;
            j--;
        }
    }

    // Recursion
    if (low < j) {
        qsort(numbers,low, j);
    }
    if (i < high) {
        qsort(numbers,i, high);
    }
}

static void exchange(int[]strings ,int i, int j) {
    int temp = strings[i];
    strings[i] = strings[j];
    strings[j] = temp;
}


}
