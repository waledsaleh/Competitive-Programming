package Main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//11530 - SMS Typing uva

public class UVA_11530 {
   
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
Reader.init(System.in);

BufferedInputStream bis = new BufferedInputStream(System.in);

	int test =Integer.parseInt(br.readLine());
	String word="";
	for(int J = 1 ; J <=test;J++)
	{
		int sum=0;
		int a=1,b=2,c=3,d=1,e=2,f=3,g=1,h=2,i=3,j=1,k=2,l=3,m=1,n=2,o=3,p=1,q=2,r=3,s=4,t=1,u=2,v=3,w=1,x=2,y=3,z=4;
		
		word=br.readLine();
		
		for(int I = 0 ; I <word.length();I++)
		{
			char X=word.charAt(I);
			switch(X)
			{
			case'a':sum+=a;break;
			case'd':sum+=d;break;
			case'g':sum+=g;break;
			case'j':sum+=j;break;
			case'm':sum+=m;break;
			case'p':sum+=p;break;
			case't':sum+=t;break;
			case'w':sum+=w;break;
			case' ':sum+=1;break;
			case'b':sum+=b;break;
			case'e':sum+=e;break;
			case'h':sum+=h;break;
			case'k':sum+=k;break;
			case'n':sum+=n;break;
			case'q':sum+=q;break;
			case'u':sum+=u;break;
			case'x':sum+=x;break;
			case'c':sum+=c;break;
			case'f':sum+=f;break;
			case'i':sum+=i;break;
			case'l':sum+=l;break;
			case'o':sum+=o;break;
			case'r':sum+=r;break;
			case'v':sum+=v;break;
			case'y':sum+=y;break;
			case's':sum+=s;break;
			case'z':sum+=z;break;
			}
			
			}
		System.out.println("Case #"+J+": "+sum);
		}
	}
	
        }
      
   

class Reader {  
    static BufferedReader reader;  
    static StringTokenizer tokenizer;  
    /** call this method to initialize reader for InputStream */  
    static void init(InputStream input) {  
         reader = new BufferedReader(new InputStreamReader(input));  
         tokenizer = new StringTokenizer("");  
    }  
    /** get next word */  
    static String next() throws IOException {  
         while ( ! tokenizer.hasMoreTokens() ) {  
              //TODO add check for eof if necessary  
              tokenizer = new StringTokenizer(reader.readLine());  
         }  
         return tokenizer.nextToken();  
    }  
    static int nextInt() throws IOException {  
         return Integer.parseInt( next() );  
    }  
    static double nextDouble() throws IOException {  
         return Double.parseDouble( next() );  
    }  
}  
