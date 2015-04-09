package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.math.*;

public class TJU_1868 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
            
        
         while(true)
         {
        	 int n = Integer.parseInt(br.readLine());
        	 if(n==0)break;
        	 System.out.println(n+" : "+count(n));
         }
         
	}
	public static int count (int n)
	{
		int c =0;
		
		Set<Integer>s = new HashSet<Integer>();
		
		for(int i = 2 ; i*i<=n;++i)
		{
			while(n%i==0)
			{
				//c++;
				s.add(i);
				n /=i;
			}
		}
		if(n>1)s.add(n);
		
		Vector<Integer> list = new Vector<Integer>(s);
		
		return list.size();
	}
	
}
