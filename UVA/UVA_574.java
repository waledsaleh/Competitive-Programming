package Main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Vector;

public class UVA_574 {

	//static Vector<Vector<Integer>>v=new Vector<Vector<Integer>>();
	static int num;
	static int[] array;
	static String str="";
	static LinkedHashSet<String>set = new LinkedHashSet<String>();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			num=sc.nextInt();
			int  n = sc.nextInt();
			if(num==0 && n==0)break;
			array = new int[n];
			for(int i = 0 ; i < n;++i)array[i]=sc.nextInt();
			
			System.out.println("Sums of "+num+":");
			Vector<Integer>res = new Vector<Integer>();
			
			sum_up(0,0,res);
			Vector<String>v = new Vector<String>(set);
			if(v.size()==0)System.out.println("NONE");
			else
			{
			for(int i = 0 ; i < v.size();++i)
			System.out.println(v.elementAt(i));
			}
			set = new LinkedHashSet<String>();
			str="";
			
			
		}
		
		
		
	}
 
	public static void sum_up(int total,int i,Vector<Integer>res)
	{
		if(total==num)
		{
			str ="";
			for(int j = 0 ; j <res.size();++j){
				if(j==0){
				str +=res.elementAt(j);
				}
				else
					str +="+"+res.elementAt(j);
			}
			
			set.add(str);
			
			return;
			
		}
		
		if(i==array.length||total>num)return;
		res.add(array[i]);
		sum_up(total+array[i],i+1,res);
		res.removeElementAt(res.size()-1);
		sum_up(total,i+1,res);
		
	}
}
