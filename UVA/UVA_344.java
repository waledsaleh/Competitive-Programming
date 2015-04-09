package Main;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UVA_344 {

	public static void main(String[] args) {
		
		
		  Hashtable<String,Integer>map = roman();
		 Scanner sc = new Scanner(System.in);
		 
		 while(true)
		 {
			 int n = sc.nextInt();
			 if(n==0)break;
			 int[] occ = new int[300];
			 
		  for(Integer i = 1; i <=n;++i)
		  {
		  for(Map.Entry entry: map.entrySet()){
	            if(i==entry.getValue())
	            {
	            	String key = entry.getKey().toString().toLowerCase();
	            	for(int  j = 0 ; j  < key.length();++j)
	            	{
	            		occ[key.charAt(j)]++;
	            	}
	              
	            }
	        }
		  
		  }
		  
		 System.out.println(n+": "+occ['i']+" i, "+occ['v']+" v, "+occ['x']+" x, "+occ['l']+" l, "+occ['c']+" c");
		
		  
		 }
		 
		 
		 
	}
  public static Hashtable<String,Integer>roman()
  {
	  Hashtable<String,Integer>map = new Hashtable<String,Integer>();
	  map.put("L", 50);
	  map.put("I", 1);
	  map.put("II", 2);
	  map.put("III", 3);map.put("IV", 4);map.put("V", 5);map.put("VI", 6);map.put("VII", 7);
	  map.put("XXX", 30);map.put("XX", 20);map.put("X", 10);map.put("IX", 9);map.put("VIII",8 );map.put("XL", 40);
	  map.put("C", 100);
	  map.put("L", 50);map.put("LX", 60);map.put("LXX", 70);map.put("LXXX", 80);map.put("XC", 90);
	  
	 String[] n ={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
	 String[] N ={"I","II","III","IV","V","VI","VII","VIII","IX"};
	 
	  int count =1;
	 for(int i = 0 ; i < n.length;++i)
	 {
		 count =1;
		 for(int j = 0; j < N.length;++j)
		 {
			 if(n[i].equals("X"))
			 {
				 map.put(n[i]+""+N[j], Integer.parseInt(1+""+count));
				 
			 }
			 else if(n[i].equals("XX"))
			 {
				 map.put(n[i]+""+N[j], Integer.parseInt(2+""+count));
				 
			 }
			 else if(n[i].equals("XXX"))
			 {
				 map.put(n[i]+""+N[j], Integer.parseInt(3+""+count));
				 
			 }
			 else if(n[i].equals("XL"))
			 {
				 map.put(n[i]+""+N[j], Integer.parseInt(4+""+count));
				 
			 }
			 else if(n[i].equals("L"))
			 {
				 map.put(n[i]+""+N[j], Integer.parseInt(5+""+count));
				 
			 }
			 else if(n[i].equals("LX"))
			 {
				 map.put(n[i]+""+N[j], Integer.parseInt(6+""+count));
				 
			 }
			 else if(n[i].equals("LXX"))
			 {
				 map.put(n[i]+""+N[j], Integer.parseInt(7+""+count));
				 
			 }
			 else if(n[i].equals("LXXX"))
			 {
				 map.put(n[i]+""+N[j], Integer.parseInt(8+""+count));
				 
			 }
			 else if(n[i].equals("XC"))
			 {
				 map.put(n[i]+""+N[j], Integer.parseInt(9+""+count));
				 
			 }
			
			 count++;
		 }
		
	 }
	   return map;
  }
}
