package Main;

import java.util.Arrays;
import java.util.Collections;

public class TCHS_SRM_44_DIV1 {

	public static void main(String[] args) {

		
		String[] res = restoreWords(new String[]{"tkwyslbgxegjvdaafcnxhetx","xwuqmvepmkxl"}, 6, 6);
		for(String j : res)System.out.print(j+" ");
	      
		
	}
 static String[] restoreWords(String[] lines, int n, int k){
	 
	 String[] res = new String[n];String conc="";int indx=0,e=0;
	 if(k==0){Arrays.fill(res, "");return res;}
	 
	 /*
	 Arrays.fill(res, "");
	 for(String words : lines){
		 if(words.equals(""))continue;
		 
		 for(int j = 0; j <words.length();++j,++e){
			 if(e == k){res[indx++]=conc;conc="";e=0;}
			 
				 conc += words.charAt(j);
			 
		 }
	 if(conc.length()==k ){ res[indx++]=conc;conc=""; e=0;}
		*/
	 
		 //Another solution
	 
	   for(String word : lines)conc +=word;
	
		for(int i = 0; i < n;++i)res[i]=conc.substring(i*k,k*i+k);
		 
	 return res;
	 
 }
}
