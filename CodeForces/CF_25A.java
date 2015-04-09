package Main;

import java.util.Scanner;

public class CF_25A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean f_odd =false,f_even=false;
		int[]array = new int[n];
		for(int i = 0 ; i <n;++i)array[i]=sc.nextInt();
		int count_even=0,count_odd=0,index_odd=0,index_even=0;
		for(int i = 0 ; i < n ; ++i)
		{
			
			if(array[i]%2==0)
			{
				f_even=true;count_even++;
				index_even=i+1;
			}
			
			 if(array[i]%2==1)
			 {
				 f_odd=true;count_odd++;
				 index_odd=i+1;
			 }
			 if(f_odd &&count_even>=2){
					System.out.println(index_odd);break;
					
				}
			 if(f_even&&count_odd>=2){System.out.println(index_even);break;}
		}
		
	}

}
