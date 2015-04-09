package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LA_6517 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

				   StringBuilder sb = new StringBuilder("");
				    while(true)
				    {
				    	int n =sc.nextInt();
                     if(n==-1)break;
               
                ArrayList<Integer>list = new ArrayList<Integer>();
				    	long sum =0;
				    	
				    	for(int  i = 1 ; i*i<=n;++i)
				    	{
				    		if(n%i==0)
			                {
			                    sum +=i;
				    			if(i==1)list.add(i);
				    			else
				    				list.add(i);
				    			
			                    if(i*i!=n&&i!=1){
		                            list.add(n/i);
		                            sum+=n/i;
			                    }
			                    
			                }
				    	
				    	
				    	}
				    	Collections.sort(list);
				    	if(sum==n)
				    	{
				    		sb.append(n+" = ");
				    		sb.append(list.get(0));
				    		for(int  i = 1 ; i < list.size();++i)
				    		{
				    			sb.append(" + "+list.get(i));
				    		}
				    	}
				    	else
				    		sb.append(n+" is NOT perfect.");
				    	
				    	sb.append("\n");
				    }
		System.out.print(sb);
		
	}

}
