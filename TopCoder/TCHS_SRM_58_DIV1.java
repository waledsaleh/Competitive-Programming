package Main;

import java.io.*;
import java.util.*;
public class TCHS_SRM_58_DIV1 {
	
	public static void main(String[] args) throws IOException {
	        
		Scanner sc = new Scanner(System.in);
		
		System.out.println(rearrange("BRBRR",new int[]{0, 0, 1, 0, 3}));
		
	}
static String rearrange(String deck, int[] above){
	
	StringBuilder sb = new StringBuilder("");
	for(int i = 0; i < above.length;++i)sb.insert(above[i], deck.charAt(i));
	
	return sb.toString();
}


}
