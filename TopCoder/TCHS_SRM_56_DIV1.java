package Main;

public class TCHS_SRM_56_DIV1 {

	public static void main(String[] args) {

		
		
		String[] rPrint=compareString(new String[]	

				{"adcbdeeaeafaklkfajlkfka"}, new String[]	

						{"adcbdeearafaklkfajlqfka"});
		
		
		
	}
     static String[] compareString(String[] a, String[] b)
     {
    	 String[] res = new String[a.length];
    	 for(int i=0; i < a.length;++i) res[i]= (checkComp(a[i],b[i])? "Yes":"No");
    	 
    	 return res;
    	 
     }
     
     static boolean checkComp(String word1,String word2)
     {
     if(word1.length() != word2.length())return false;
    	 
    	 int count =0;
    	 for(int i = 0; i < word1.length();++i)if(word1.charAt(i)!=word2.charAt(i))count++;
    	
    	return (count>1?false:true);
    	 
     }
} 
