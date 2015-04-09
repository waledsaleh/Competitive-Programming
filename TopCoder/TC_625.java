package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TC_625 {
	
	public static void main(String[] args) {

		
	}
	static int[] makeExpression(int y)
	{
		if(y==0)return new int[]{7, 10, -70};
		if(y==1)return new int[]{2,10,-19};
		
		
		return new int[]{y,2,-y};
	}
	 
}
