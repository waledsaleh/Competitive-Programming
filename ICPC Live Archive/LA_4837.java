package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class LA_4837 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String word;String str;int n;
		int test = Integer.parseInt(br.readLine());
		while(test-->0) 
		{
			n=Integer.parseInt(br.readLine());
			boolean f = false; 
			int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0;
		 word = br.readLine().trim();
		 word = word.replaceAll(" ", "");
		Set<Character>s = new HashSet<Character>();
		for(int i = 0 ; i <word.length();++i) 
		{
			s.add(word.charAt(i));
		}
		// s.remove(" ");
		Vector<Character>v = new Vector<Character>(s);
	//	v.removeElement(" ");
		 
		if(v.size()==1&&v.get(0)=='H')
		{
			
				
				System.out.println(n+" "+count1+" "+count2+" "+count3+" "+count4+" "+count5+" "+count6+" "+count7+" "+38);
				
		}
		else if(v.size()==1&&v.get(0)=='T')
		{
			
				System.out.println(n+" "+38+" "+count2+" "+count3+" "+count4+" "+count5+" "+count6+" "+count7+" "+count8);
			
		}
		else
		{
			str = "";
		count1=0;count2=0;count3=0;count4=0;count5=0;count6=0;count7=0;count8=0;
			//	int c =3;
		word = word.replaceAll(" ", "");
		for(int i = 0 ; i <word.length();i++)
		{
			if(i==38)break;
			str=word.charAt(i)+""+word.charAt(i+1)+""+word.charAt(i+2);
			//c +=3;
			switch(str)
			{
			case "TTT":count1 ++;break;
			case "TTH":count2 ++;break;
			case "THT":count3 ++;break;
			case "THH":count4 ++;break;
			case "HTT":count5 ++;break;
			case "HTH":count6 ++;break;
			case "HHT":count7 ++;break;
			case "HHH":count8 ++;break;
			//case "TTT":count1 ++;break;
				
				
				
			}
		}
		System.out.println(n+" "+count1+" "+count2+" "+count3+" "+count4+" "+count5+" "+count6+" "+count7+" "+count8);
				}
		
		}
		
	}
	
}
