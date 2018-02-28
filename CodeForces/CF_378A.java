package Main;
import java.util.*;
import java.math.*;

public class CF_378A {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
    int[] arr = {1,2,3,4,5,6};
		  int n1 = sc.nextInt(),n2=sc.nextInt();
		  int c1=0,c2=0,c3=0;
		  
		for(int i =0 ; i < arr.length;++i){
			if(Math.abs(n1-arr[i])<Math.abs(n2-arr[i]))c1++;
			if(Math.abs(n1-arr[i])>Math.abs(n2-arr[i]))c3++;
			if(Math.abs(n1-arr[i])==Math.abs(n2-arr[i]))c2++;
				
			
		}
		  System.out.println(c1+" "+c2+" "+c3);
		  
		
	}

}
