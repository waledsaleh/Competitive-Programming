package Main;


public class SPOJ_8215 {
	public static void main(String[] args) throws java.io.IOException {

		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String word;
		int test = sc.nextInt();
		char[] e;
		while(test-->0)
		{
	 word = sc.next();
	
	
	 java.util.Set<Character>s = new java.util.HashSet<Character>();
	for(int i = 0 ; i<word.length();++i)
	{
		
		s.add(word.charAt(i));
		
	}
	System.out.println(s.size());
	
		}
	
	}
}
