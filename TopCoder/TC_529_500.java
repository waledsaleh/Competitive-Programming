package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class TC_529_500 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] a =getSortedList(new String[]{"Philippe VI", "Jean II", "Charles V", "Charles VI", "Charles VII", "Louis XI"});
		
		
	for(String e : a)System.out.print(e+" ");
		

		
	}
	
   static String[] getSortedList(String[] kings)
   {
	   String[] split;
	  Hashtable<String,Integer>map = new Hashtable<String,Integer>();
	  map.put("L", 50);
	  map.put("I", 1);
	  map.put("II", 2);
	  map.put("III", 3);map.put("IV", 4);map.put("V", 5);map.put("VI", 6);map.put("VII", 7);
	  map.put("XXX", 30);map.put("XX", 20);map.put("X", 10);map.put("IX", 9);map.put("VIII",8 );map.put("XL", 40);
	  
	 String[] n ={"X","XX","XXX","XL"};
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
			 count++;
		 }
	 }
	  
	  
	    Vector<String> names =new Vector<String>();
	    Vector<Integer> numbers = new Vector<Integer>();
	    
	   for(int i = 0 ; i < kings.length;++i)
	   {
		   split=kings[i].split(" ");
		   names.add(split[0]);
		   numbers.add(map.get(split[1]));
	   }
	   String[] name = new String[names.size()];
	   int[] num = new int[numbers.size()];
	   
	   for(int i = 0 ; i < names.size();++i)name[i]=names.get(i);
	   for(int i= 0 ; i < numbers.size();++i)num[i]=numbers.get(i);
	   
	   bubble(kings,name,num);
	   
	   return kings;
   }
 public static void bubble(String[]kings,String[] names , int[]numbers)
 {
	 for(int i = 0 ; i <kings.length;++i )
	 {
		 for(int j = i+1 ; j < kings.length;++j)
		 {
			 if(!names[i].equals(names[j]))
			 {
				 if(names[i].compareTo(names[j])>0)
				 {
				 String temp = kings[i];
				 kings[i]=kings[j];
				 kings[j]=temp;
				 
				 String temp2 = names[i];
				 names[i]=names[j];
				 names[j]=temp2;
				 
				 int temp3 = numbers[i];
				 numbers[i]=numbers[j];
				 numbers[j]=temp3;
				 
				 }
			 }
			 else if(names[i].equals(names[j]))
			 {
			     if(numbers[i]>numbers[j])
			     {
			    	 String temp = kings[i];
					 kings[i]=kings[j];
					 kings[j]=temp;
					 
					 int temp2 = numbers[i];
					 numbers[i]=numbers[j];
					 numbers[j]=temp2;
			     }
			 }
			 
		 }
		 
	 }
	 
 }

}
