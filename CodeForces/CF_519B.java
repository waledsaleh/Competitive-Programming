package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class CF_519B {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum1=0,sum2=0,sum3=0;
		
		for(int i = 0 ; i < n  ; ++i)
		{
		sum1 +=sc.nextInt();
		}
		for(int i = 0 ; i < n-1  ; ++i)sum2 +=(sc.nextInt());
		for(int i = 0 ; i < n-2  ; ++i)sum3 +=(sc.nextInt());
		 
	   System.out.print((sum1-sum2)+"\n"+(sum2-sum3));
		 
		
	}
	

}
