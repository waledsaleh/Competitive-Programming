package Main;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UVA_12667{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String,Integer>m1 = new TreeMap<String,Integer>();
		Map<Character,Integer>m2 = new TreeMap<Character,Integer>();
		Map<Character,Integer>m3 = new TreeMap<Character,Integer>();
		
		int n = sc.nextInt(),t=sc.nextInt(),s=sc.nextInt();
		
		while(s-->0)
		{
			
		int t1 = sc.nextInt(),id=sc.nextInt();
		String p = sc.next(),v=sc.next();	
		if(v.equals("Yes"))	
		{
			if(!m1.containsKey(p.charAt(0)+" "+id)){
				
			m1.put(p.charAt(0)+" "+id, id);
			m2.put(p.charAt(0), t1);
			m3.put(p.charAt(0), id);
			
			}
		
		}
			
			
		}
		for(char i ='A',j =0;j<n&&i<= 'Z';++i,++j)
		{
			if(m2.containsKey(i))
			System.out.println(i+" "+m2.get(i)+" "+m3.get(i));
			else
				System.out.println(i+" - "+"-");
		}
		
	}
  
}


 
