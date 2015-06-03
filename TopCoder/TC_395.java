package Main;

import java.util.Vector;

public class TC_395 {

	public static void main(String[] args) {

		System.out.println(getNumber(123));
		
		
	}
	static int getNumber(int n)
	{
		Vector<Integer>v = new Vector<Integer>();
		// Pre-computing
		for(int i = 0; i <100001;++i)
		{
			
			if(String.valueOf(i).contains("2")||String.valueOf(i).contains("3")||
					String.valueOf(i).contains("5")||String.valueOf(i).contains("6")
					||String.valueOf(i).contains("7")||String.valueOf(i).contains("8"))continue;
			else
			v.add(i);
			
		}
		//get answer in o(1)
		return v.elementAt(n);
	}
}
