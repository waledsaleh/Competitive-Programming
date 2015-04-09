package Main;

import java.io.IOException;

public class TC_571 {
	
	public static void main(String[] args) throws IOException {

		
		
	}
    static int countStars(String[] result)
    {
    	// This problem can be solved by using hash-table
    	int total=0;
    	for(int i = 0 ; i < result.length;++i)
    	{
    		switch(result[i])
    		{
    		case "o--": total++;break;
    		case "oo-":total +=2;break;
    		case "ooo": total +=3;break;
    		
    		
    		}
    	}
    	return total;
    }

}
