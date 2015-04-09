package Main;

import java.util.Arrays;
import java.util.Scanner;

public class UVA_11713 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0)
		{
			String first = sc.next();
			String sec = sc.next();
			if(first.length()!=sec.length()){System.out.println("No");continue;}
			if(check(first,sec))System.out.println("Yes");
			else
				System.out.println("No");
			
		}
		
	}
    public static boolean check(String first,String sec)
    {
    	boolean f =false;
    	for(int i = 0 ; i < first.length();++i)
    	{
    		if(first.charAt(i)!=sec.charAt(i))
    		{
    			if(first.charAt(i)=='a'||first.charAt(i)=='e'||first.charAt(i)=='i'||first.charAt(i)=='o'
    					||first.charAt(i)=='u')f= true;

    				else
    				return false;
    		
    			if(sec.charAt(i)=='a'||sec.charAt(i)=='e'||sec.charAt(i)=='i'||sec.charAt(i)=='o'
    					||sec.charAt(i)=='u')f= true;
    			else
    			return false;
    		}
    	}
    	return true;
    }
}
