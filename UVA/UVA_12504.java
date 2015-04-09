package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

public class UVA_12504 {

	static Vector<String>v_old;
	static Vector<String>v_old_value;
	static Vector<String>v_new;
	static Vector<String>v_new_value;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
			v_old=new Vector<String>();
			v_old_value=new Vector<String>();
			v_new=new Vector<String>();
			v_new_value=new Vector<String>();
			
			String Old = br.readLine();
			String New =br.readLine();
			String old = "";
			String n ="";
			
			if(Old.length()==2 && New.length()==2)
			{
				System.out.println("No changes\n");continue;
			}
			for(int i = 1 ; i<Old.length()-1;++i )old+=Old.charAt(i);
			for(int i = 1 ; i<New.length()-1;++i )n+=New.charAt(i);
			
			
			  first(v_old,v_old_value,old);
			  second(v_new,v_new_value,n);
			
					Vector<String>res1=new Vector<String>();
					Vector<String>res2=new Vector<String>();
					HashSet<String>s = new HashSet<String>();
					
					for(int i = 0 ; i <v_new.size();++i)
					{
						if(!v_old.contains(v_new.elementAt(i)))
								{
							res1.add(v_new.elementAt(i));
								}
						else
						{
							String n1 =v_new_value.get(i);
							int index = v_old.indexOf(v_new.elementAt(i));
							String n2 = v_old_value.get(index);
							if(!n1.equals(n2))s.add(v_new.elementAt(i));
						}
					}
					
					for(int i = 0 ; i <v_old.size();++i)
					{
						if(!v_new.contains(v_old.elementAt(i)))
								{
							res2.add(v_old.elementAt(i));
								}
						else
						{
							String n1 =v_old_value.get(i);
							int index = v_new.indexOf(v_old.elementAt(i));
							String n2 = v_new_value.get(index);
							if(!n1.equals(n2))s.add(v_old.elementAt(i));
						}
					}
					Collections.sort(res1);
					
					Collections.sort(res2);
					
					Vector<String>res3=new Vector<String>(s);
					
					Collections.sort(res3);
					
					if(res1.isEmpty()&&res2.isEmpty()&&res3.isEmpty())System.out.println("No changes");
					
				/*	else if(res1.isEmpty()&&!res2.isEmpty()&&!res3.isEmpty())
					{
						print2(res2);
						print3(res3);
					}
					else if(!res1.isEmpty()&&res2.isEmpty()&&!res3.isEmpty())
					{
						print1(res1);
						print3(res3);
					}
					else if(!res1.isEmpty()&&res2.isEmpty()&&res3.isEmpty())print1(res1);
					
					else if(res1.isEmpty()&&!res2.isEmpty()&&res3.isEmpty())print2(res2);
					
					else if(res1.isEmpty()&&res2.isEmpty()&&!res3.isEmpty())print3(res3);
					
					else
					{
						print1(res1);
						print2(res2);
						print3(res3);
						
					}
					*/
					if(!res1.isEmpty())
						print1(res1);
						if(!res2.isEmpty())
						print2(res2);
						if(!res3.isEmpty())
						print3(res3);
						
					System.out.println();
		}
		
		
	}
	public static void second(Vector<String>v1,Vector<String>v2,String e)
	{
		if(e.equals(""))return;
		 String[] split=e.split(",");
			
			for(int i  = 0 ; i < split.length;++i)
			{
				String[]sp = split[i].split(":");
				v_new.add(sp[0]);
				v_new_value.add(sp[1]);
			}
	}
	public static void first(Vector<String>v1,Vector<String>v2,String old)
	{
		if(old.equals(""))return;
		 String[] split=old.split(",");
			
			for(int i  = 0 ; i < split.length;++i)
			{
				String[]sp = split[i].split(":");
				v_old.add(sp[0]);
				v_old_value.add(sp[1]);
			}
	}
 public static void print1(Vector<String>r)
 {
	 for(int i = 0 ; i < r.size();++i)
	 {
	   if(i==0)System.out.print("+"+r.elementAt(i));
	   else
		   System.out.print(","+r.elementAt(i));
	 }
	 System.out.println();
 }
 public static void print2(Vector<String>r)
 {
	 for(int i = 0 ; i < r.size();++i)
	 {
	   if(i==0)System.out.print("-"+r.elementAt(i));
	   else
		   System.out.print(","+r.elementAt(i));
	 }
	 System.out.println();
 }
 public static void print3(Vector<String>r)
 {
	 for(int i = 0 ; i < r.size();++i)
	 {
	   if(i==0)System.out.print("*"+r.elementAt(i));
	   else
		   System.out.print(","+r.elementAt(i));
	 }
	 System.out.println();
 }
 
}
