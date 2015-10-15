package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class LA_4964 {

	
	public static void main(String[] args) {
          
  		Scanner sc = new Scanner(System.in);
        
		int a1,a2,a3;
		
		while(true)
		{
			a1=sc.nextInt();a2=sc.nextInt();a3=sc.nextInt();
			if( a1==0 && a2==0 && a3==0 )return;
			
			if((a2-a1)+a2==a3)System.out.println("AP "+((a2-a1)+a3));
			else
				System.out.println("GP "+((a2/a1)*a3));
			
			
		}
		
		
		
        
	}
	
}
