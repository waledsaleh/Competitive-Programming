package Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF_937A {

	public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        Set<Integer> s= new HashSet<Integer>();

        while(n-->0){
            int x = sc.nextInt();

            if(x != 0)s.add(x);
        }


        System.out.println(s.size());

		
	}

		
	static	{ 
	
	
	

	}

	
}
