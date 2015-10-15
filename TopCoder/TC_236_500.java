package Main;

import java.util.*;

public class TC_236_500 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		
		
	}
static String getTask(String[] list, int n) {

	Vector<String>v = new Vector<String>(Arrays.asList(list));
	
	int r=0,p=0;
	while(v.size()>1)
	{
		r = (p+n-1)%v.size();
		v.remove(r);
		p = r%v.size();
	}
	
	return v.get(0);
}

}
