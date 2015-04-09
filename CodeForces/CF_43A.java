package Main;

import java.util.Scanner;

public class CF_43A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n  =sc.nextInt();
		int[] array = new int[200];
		String[] words= new String[n];
	    for(int i = 0 ; i < words.length;++i)words[i]=sc.next();
        
	    for(int i = 0 ; i < words.length;++i)
	    {
	    	int count =0;
	    	for(int j = i+1 ; j <words.length;++j)
	    	{
	    		if(words[i].equals(words[j]))count++;
	    	}
	    	array[i]=count;
	    }
	    int max = Integer.MIN_VALUE;
	    int index =0;
	     for(int i =  0 ; i < array.length;++i)
	     {
	    	 if(array[i]>max)
	    	 {
	    		 max = array[i];
	    		 index =i;
	    	 }
	     }
	     System.out.println(words[index]);
	     
	}

}

/*
 * int n = ni();
		HashMap<String, Integer> x = new HashMap<String, Integer>();
		for(int i = 0;i < n;i++){
			String s = in.next();
			if(!x.containsKey(s)){
				x.put(s, 0);
			}
			x.put(s, x.get(s) + 1);
		}
		
		String max = "";
		int maxw = 0;
		for(Map.Entry<String, Integer> e : x.entrySet()){
			if(maxw < e.getValue()){
				max = e.getKey();
				maxw = e.getValue();
			}
		}
		out.println(max);
		
		
		*/
