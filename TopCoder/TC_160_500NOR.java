package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class TC_160_500NOR {

	public static void main(String[] args) {

		int[] x={-3653, -4300, 4346, -6884, 3961, 9904, -1824, 5221, -3512, -7656, 9944, -9575};
		int[] y ={441, 1735, -9002, 6132, -549, 6507, -5967, -5115, 5784, -8219, 566, -6581};
		System.out.println(area(x,y));
		
	}
	static  int area(int[] x, int[] y)
	{
	
	int oo=987654321;
	int lx=-oo, hx=oo;
	int ly=-oo, hy=oo;

		for(int i = 0 ; i <x.length;i+=2)
		{
			lx = Math.max(lx, Math.min(x[i],x[i+1]));
			hx = Math.min(hx, Math.max(x[i],x[i+1]));
			ly = Math.max(ly, Math.min(y[i],y[i+1]));
			hy = Math.min(hy, Math.max(y[i],y[i+1]));
		}
		
		if(hx<lx)hx = lx;
		if(hy<ly)hy =ly;
		
		return (hx-lx)*(hy-ly);
		
	}

}
