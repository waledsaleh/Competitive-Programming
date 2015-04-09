package Main;

import java.util.Arrays;
import java.util.Scanner;

public class TC_166_500 {
	
	public static void main(String[] args) {
	
         Scanner sc = new Scanner(System.in);
		
        int[] a=arrange(new int[]	

{811385,340578,980086,545001,774872,855585,13848,863414,419523,190151,784903,127461});
       
		for(int e : a)System.out.print(e+ " ");
	}
	
	static int[] arrange(int[] numbers)
	{
		// Integer.bitcount()---> count one-bits in binary
		
	   int[] array = new int[numbers.length];
		
	   for(int i = 0 ; i < numbers.length;++i) array[i]=Integer.bitCount(numbers[i]);
	  
	   bubble(array,numbers);
	   
		return numbers;
		
	}
public static void bubble(int[] a,int[] numbers)
{
	 for(int i = 0 ; i < a.length;++i)
     {
     	for(int j =i+1; j < a.length;++j)
         	{
     		if(a[i]>a[j])
     		{
     			
     			a[i] ^=a[j];
     			a[j] ^=a[i];
     			a[i] ^=a[j];
     			
     			numbers[i] ^=numbers[j];
     			numbers[j] ^=numbers[i];
     					numbers[i] ^=numbers[j];
     					
     		}
     		else if(a[i]==a[j])
     		{
     			if(numbers[i]>numbers[j])
     			{
     				numbers[i] ^=numbers[j];
         			numbers[j] ^=numbers[i];
         					numbers[i] ^=numbers[j];
         					
     			}
     			
     		}
     	}
     }
}

}
