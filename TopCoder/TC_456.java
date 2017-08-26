package Main;

public class TC_456 {

	public static void main(String[] args) {
		
		System.out.println(minRep("apple"));
		
		
		
	}

	static 	int minRep(String word){
		if(word.length() <= 4)return -1;
	    
		word = word.toLowerCase();
		int count =0,i=1;
		if(word.charAt(0)!='a')++count;
		if(word.charAt(word.length()-2) != 'l')++count;
		if(word.charAt(word.length()-1)!='e')++count;
			
		for(; i < word.length()-2;++i)
			if(word.charAt(i)!='p')
				++count;
			
			
		
		
		
		return  count ;
	}
	
}
