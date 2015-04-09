package Main;

import java.util.Arrays;
import java.util.Scanner;

public class CF_454A {

public static void main( String[] args ) {
	  Scanner sc = new Scanner(System.in);
	  DrawDiamond d=	new DrawDiamond();
	  int n = sc.nextInt();
	  d.draw(n);

	  
}

	
}
 class DrawDiamond {

    public void draw(int max) {
    	 char[][] ch = new char[max][max];
        String maxStars = filledString(max, 'D');
        String maxSpaces = filledString(max, '*');
        for (int i = 0; i < max; i++) {
            String spaces = maxSpaces.substring(0, startIndex(max, i));
            String stars = maxStars.substring(0, width(max, i));
            //System.out.println(spaces + stars);
            String res = spaces+stars;
            for(int j = 0 ; j < res.length();++j)
            {
            	ch[i][j]=res.charAt(j);
            }
            
        }
    
        for (int i = 0; i < max; i++) {
        	
        	for(int j = 0 ; j < max;++j)
        	{
        		if(ch[i][j]!='D')ch[i][j]='*';
        	
        	}
        	
        }
        
       for (int i = 0; i < max; i++) {
        	for(int j = 0 ; j < max;++j)
        	{
        		System.out.print(ch[i][j]);
        	}
        	System.out.println();
        }
        
        
    }

    private int width(int max, int line) {
        return  -Math.abs(line - (max - 1) / 2) * 2 + max;
    }

    private int startIndex(int max, int line) {
        return Math.abs(line - (max + 1) / 2 + 1);
    }

    private String filledString(int width, char val) {
        char[] characters = new char[width];
        Arrays.fill(characters, val);
        return new String(characters);
    }

}