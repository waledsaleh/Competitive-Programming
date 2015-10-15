package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class LA_2062 {

	public static void main(String[] args) throws IOException {

		 Scanner sc = new Scanner(System.in);
		 
		 String line;
		 while(!(line=sc.next()).equals("end"))
		 {
			 
		if(!line.contains("e")&&!line.contains("i")&&
			 !line.contains("o")&&!line.contains("u")&&
			 !line.contains("a")){System.out.println("<"+line+"> "+"is not acceptable.");continue;}
			 
		 String save=line;
	  line = line.replace("ee", "").replace("oo", "");
			boolean check=false;
			 int countC=0,countV=0;
			 for(int i =0; i <line.length();++i)
			 {
				 if(i !=line.length()-1 && line.charAt(i)==line.charAt(i+1)){check=true;break;}
				 
				 if(line.charAt(i)=='e'||line.charAt(i)=='i'||
						 line.charAt(i)=='o'||line.charAt(i)=='u'||
						 line.charAt(i)=='a'){
					 countV++;
					 countC=0;
					 if(countV==3){check=true;break;}
				 }
				 else
				 {
					 countC++;
					 countV=0;
					 if(countC==3){check=true;break;}
				 }
				 
			 }
			 
			 if(check)
			 System.out.println("<"+save+"> "+"is not acceptable.");
			 else
			 System.out.println("<"+save+"> "+"is acceptable.");
			 
			 
		 }
      
	}

}
