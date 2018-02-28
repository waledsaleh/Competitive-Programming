package Main;
import java.util.*;
import java.math.*;

public class CF_490A {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedList<ArrayList<Integer>> vic = new LinkedList<ArrayList<Integer>>();
		for(int i = 0; i < 3 ;++i)vic.add(new ArrayList<Integer>());
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n ;++i)vic.get(sc.nextInt()-1).add(i+1);
			
		min =Math.min(min,Math.min(vic.get(1).size(),Math.min(vic.get(2).size(), vic.get(0).size())));
		
		if(min==0){System.out.println(0);return;}
			System.out.println(min);
		
		for(int i = 0; i < min;++i){
			System.out.print(vic.get(0).get(i)+" "+vic.get(1).get(i)+" "+vic.get(2).get(i));
			System.out.println();
		
		}
		
		
		
	}
 
	
	
}
