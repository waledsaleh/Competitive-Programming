package Main;

public class TC_302 {

	public static void main(String[] args) {

		String[]s  = makePlural(new String[]{"a", "s", "o", "y", "n"});
		for(String k : s)System.out.print(k+" ");
		
		
	}
 static String[] makePlural(String[] nouns)
 {
	
	 for(int i = 0; i < nouns.length;++i)
	 {
		 char[] ch = nouns[i].toCharArray();
		 if(ch[ch.length-1]=='s'||ch[ch.length-1]=='z'||ch[ch.length-1]=='x'
	 ||(ch.length>=2&&ch[ch.length-1]=='h'&&ch[ch.length-2]=='c')||(ch.length>=2&&ch[ch.length-2]=='s'&&ch[ch.length-1]=='h'))
		 {
			 nouns[i] +="es";
			 
		 }
		 else if((ch.length>=2&&ch[ch.length-2]=='a'&&ch[ch.length-1]=='y')||(ch.length>=2&&ch[ch.length-2]=='e'&&ch[ch.length-1]=='y')
	||(ch.length>=2&&ch[ch.length-2]=='i'&&ch[ch.length-1]=='y')||(ch.length>=2&&ch[ch.length-2]=='u'&&ch[ch.length-1]=='y')
				 ||(ch.length>=2&&ch[ch.length-2]=='o'&&ch[ch.length-1]=='y'))
		 {
			 nouns[i] +="s";
		 }
		 else if(ch[ch.length-1]=='y')
		 {
			 nouns[i]=new StringBuilder(nouns[i]).deleteCharAt(ch.length-1).toString();
			 nouns[i] +="ies";
		 }
		 else
			 nouns[i] +="s";
	 }
	 
	 return nouns;
	 
 }
}
