package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class CF_144A {
	public static void main(String[] args) throws IOException {


	          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                     Scanner sc = new Scanner(System.in);
                        
                     int max = 0;
                    
                     
                    int n = sc.nextInt();
                    int[] array = new int[n];
                    
                    int index_max=0;
                     int min = 1000 ;
                    int index_min=0;
                    for(int i = 0 ; i <n;++i)
                    {
                    	array[i]=sc.nextInt();
                    	
                    	if(array[i]>max)
                    	{
                    	max = array[i];
                    	index_max =i;
                    	//min = Math.min(min,array[i]);
                    	}
                    	if(array[i]<=min)
                    	{
                    		min = array[i];
                    	index_min=i;
                    }
                   // dup(array);
                    }
                   
                    int count =0;
                    if( index_max > index_min ){
                		System.out.println((index_max + (n-1-index_min))-2 );
                	}
                	else
                	{
                		System.out.println((index_max + (n-1-index_min) - 1)) ;
                	}
                    
                    
 //                   }
                    /*
                    for(int i = 1 ; i <n;++i)
                    {
                    	if(array[n-1]!=min)
                    	{
                    		int linear = min(array,min);
                    		
                    		int temp= array[linear];
                    		array[linear]=array[linear+1];
                    		array[linear+1]=temp;
                           		count++;
                    	}
                    	if(array[0]!=max)
                    	{
                    	//	int max_index =binary(array,max);
                    		
                    		
                    			int l_m = linear(array,max);
                    			int temp= array[l_m];
                        		array[l_m]=array[l_m-1];
                        		array[l_m-1]=temp;
                        		
                               		count++;
                    			
                    		
                    	}
                    	if(array[0]==max&&array[n-1]==min)
                    		break;
                    }
                    System.out.println(count);
                    */
                    
	}
	public static int min(int []array,int key)
	{
		
		int index = 0 ;
		boolean f = true;
		for(int i = array.length-1;i>=0;--i)
		{
			if(array[i]==key)
			{
				index = i;
				f= false;
			}
			if(!f)break;
		}
		return index;
		
	}
  public static int linear(int[]array,int key)
  {
	  int index =0;
	  boolean f = true;
	  for(int i = 1 ; i <array.length;++i)
	  {
		  if(array[i]==key)
		  {
			  f= false;
			  index = i;
		  }
		  if(!f)break;
	  }
	  return index;
  }

}
