package Main;

import java.util.Scanner;

public class UVA_10810 {
	static int n;
	static long[]array;
	static long inversions=0;
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   while(true)
   {
		 n = sc.nextInt();
		if(n==0)break;
		 array = new long[n];
		for(int i = 0 ; i < n ; ++i)array[i]=sc.nextInt();
		getInversions(array, 0,n-1);
	    System.out.println(inversions);
		inversions=0;
		
   }	
		
	}
	public static void getInversions(long[] nums, int left, int right) {
		  if (left < right) {
		    //Split in half
		    int mid = (left + right) / 2;
		    //Sort recursively.
		    getInversions(nums, left, mid);
		    getInversions(nums, mid + 1, right);
		    //Merge the two sorted sub arrays.
		    merge(nums, left, mid, right);
		  }
		}
		 
		private static void merge(long[] nums, int left, int mid, int right) {
		  int leftLength = mid - left + 1;
		  int rightLength = right - mid;
		  long[] lAr = new long[leftLength];
		  //Just for simplicity, we are creating this right array.
		  //We could use actual nums array with mid and right indexes.
		  //a place to improve memory foot print.
		  long[] rAr = new long[rightLength];
		  for (int i = 0; i < leftLength; i++) {
		    lAr[i] = nums[left + i];
		  }
		  for (int i = 0; i < rightLength; i++) {
		    rAr[i] = nums[mid + 1 + i];
		  }
		  int i = 0, j = 0, k = left;
		  while (i < leftLength && j < rightLength) {
		    if (lAr[i] <= rAr[j]) {
		      nums[k] = lAr[i];
		      inversions += j;
		      i++;
		    } else {
		      nums[k] = rAr[j];
		      j++;
		    }
		    k++;
		  }
		  //remaining iversions, using long cast as multiplication will be out of
		  //Integer range for large inputs
		  inversions += (long) j * (leftLength - i);
		  if (i >= leftLength) {
		    //copy remaining elements from right
		    for (; j < rightLength; j++, k++) {
		      nums[k] = rAr[j];
		    }
		  } else {
		    //copy remaining elements from left
		    for (; i < leftLength; i++, k++) {
		      nums[k] = lAr[i];
		    }
		  }
		}
}
