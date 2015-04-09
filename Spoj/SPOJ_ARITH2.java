package Main;



public class SPOJ_ARITH2 {
	public static void main(String[] args) throws java.io.IOException {

		java.io.BufferedReader br = new java.io.BufferedReader(new  java.io.InputStreamReader(System.in));
//	Scanner sc = new Scanner(System.in);
		
	int test = Integer.parseInt(br.readLine());
	String word="";
	StringBuilder sb = new StringBuilder("");
	
	while(test-->0)
	{
		System.out.println();
	 word = br.readLine();
	String[] sp = word.split(" ");
	
	sb=calculate(sp);
	
	System.out.println(sb);
	
	}
	
		
		
	}
	public static StringBuilder calculate(String[]sp)
	{
		String e ="";
		java.util.Stack<Long>s = new java.util.Stack<Long>();
		StringBuilder sb1 = new StringBuilder("");
		java.util.Stack<Character>c = new java.util.Stack<Character>();
		for(int i = 0 ,j=0; i <sp.length;)
		{
			
			
			char ch =sp[i].charAt(0);
			//e=sp[i]+"";
			if(Character.isDigit(ch))
			{
				e=sp[i]+"";
				s.push(Long.parseLong(e));
				i++;
				if(i>2){
				if(c.get(0)=='+')
				{
					s.push(s.get(j)+s.get(j-1));
					c.pop();
					j++;
				}
				
				else if(c.get(0)=='*')
				{
					s.push(s.get(j)*s.get(j-1));
					c.pop();
					j++;
				}
				else if(c.get(0)=='/')
				{
					s.push(s.get(j-1)/s.get(j));
					c.pop();
					j++;
				}
				else if(c.get(0)=='-')
				{
					s.push(s.get(j)-s.get(j-1));
					c.pop();
					j++;
				}
				}
				 
			}
			else if(ch=='+'||ch=='*'||ch=='/'||ch=='-')
			{
				
				c.push(ch);
				j++;i++;
				
			}
			else
				i++;
			
		}
		
		sb1.append(s.peek()+"\n");
		
		return sb1;
		
		}
}

// Another solution


/*
 *     import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;
    import java.util.Vector;
     
    
     
  /*  class Arith2 {
     
            public static void main(String[] args) throws NumberFormatException, IOException {
                   
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    int cases = Integer.parseInt(br.readLine());
                    String line;
                    StringBuilder sb;
                    String[] tok;
                    long res;
                    StringTokenizer st;
                    Vector<String> op, val;
                    for(int i = 0; i < cases; i++){
                            op = new Vector<String>();
                            val = new Vector<String>();
                            br.readLine();
                            line = br.readLine();
                            tok = line.split("\\s");
                            sb = new StringBuilder();
                            for(int k = 0; k < tok.length - 1; k++)
                                    sb.append(tok[k]);
                            line = sb.toString();
                            st = new StringTokenizer(line,"1234567890");
                            while(st.hasMoreTokens()){
                                    op.addElement(st.nextToken());
                            }
                            st = new StringTokenizer(line,"+-*/");
    /*                        while(st.hasMoreTokens()){
                                    val.addElement(st.nextToken());
                            }
                            res = Integer.parseInt(val.elementAt(0).toString());
                            for(int j = 0; j < op.size(); j++){
                                    if(op.elementAt(j).toString().equals("+"))
                                            res += Integer.parseInt(val.elementAt(j+1).toString());
                                    else if(op.elementAt(j).toString().equals("-"))
                                            res -= Integer.parseInt(val.elementAt(j+1).toString());
                                            else if(op.elementAt(j).toString().equals("*"))
                                                    res *= Integer.parseInt(val.elementAt(j+1).toString());
                                                    else if(op.elementAt(j).toString().equals("/"))
                                                            res /= Integer.parseInt(val.elementAt(j+1).toString());
                            }
                            System.out.println(res);
                            res = 0;
                    }
            }
    }
   
*/