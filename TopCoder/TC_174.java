package Main;
import java.util.*;

public class TC_174 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	}

	static int countWords(String[] board, int size)  {
		
		int count = 0;
		for(String i : board)
			for(String j :  i.split("X"))if(j.length()==size)count++;
			
		return count;
	}
}
