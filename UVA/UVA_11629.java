package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class UVA_11629 {

	public static void main(String[] args) throws IOException {
		
       Scanner sc = new Scanner(System.in);
   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	 String[] split = br.readLine().split(" ");
		int p = Integer.parseInt(""+split[0]);
		int g =Integer.parseInt(""+split[1]);
		StringBuilder sb = new StringBuilder("");
		
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		while(p-->0)
		{
			split = br.readLine().split(" ");
			map.put(split[0], ConvertToInt(split[1]));
			
		}
		
		for(int i =1 ; i <= g ;++i)
		{
			split = br.readLine().split(" ");
			double sum=0.0;
		
			for(int j =0 ; j < split.length-2;j+=2)sum +=map.get(split[j]);
			
			switch(split[split.length-2])
			{
			case ">":
				if(sum > Integer.parseInt(split[split.length-1])*10)
			    sb.append("Guess #"+i+" was correct."); 
				else
					sb.append("Guess #"+i+" was incorrect.");
				break;
			case "<":
				if(sum < Integer.parseInt(split[split.length-1])*10)
					sb.append("Guess #"+i+" was correct."); 
				else
					sb.append("Guess #"+i+" was incorrect.");
				break;
			case "<=":
				if(sum <= Integer.parseInt(split[split.length-1])*10)
					sb.append("Guess #"+i+" was correct."); 
				else
					sb.append("Guess #"+i+" was incorrect.");
				break;
				
			case ">=":
				if(sum >= Integer.parseInt(split[split.length-1])*10)
					sb.append("Guess #"+i+" was correct."); 
				else
					sb.append("Guess #"+i+" was incorrect.");
				break;
				
			case "=":
				if(sum == Integer.parseInt(split[split.length-1])*10)
					sb.append("Guess #"+i+" was correct."); 
				else
					sb.append("Guess #"+i+" was incorrect.");
				break;
				
			}
			
			sb.append("\n");
			
		}
		System.out.print(sb);
		
	}
	static int ConvertToInt(String num){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){
            if(Character.isDigit(num.charAt(i))){
                sb.append(num.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
