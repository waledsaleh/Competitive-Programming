package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TIMUS_2002 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             HashMap<String,String>map = new HashMap<String,String>();
			  ArrayList<String>list = new ArrayList<String>();
			  
			  
		  int n = Integer.parseInt(br.readLine());
		  String first=null,username=null,pass=null;
		  while(n-->0)
		  {
			
			
			   StringTokenizer st = new StringTokenizer(br.readLine());
			   first = st.nextToken();
			  if(first.equals("register"))
			  {
				  username =st.nextToken();
				  pass = st.nextToken();
				  if(map.containsKey(username))
				  {
					  System.out.println("fail: user already exists");
					  
				  }
				  else
				  {
					  map.put(username, pass);
					  System.out.println("success: new user added");
					  
				  }
			  }
			  if(first.equals("login"))
			  {
				  username =st.nextToken();
				  pass = st.nextToken();
				  if(!map.containsKey(username))
				  {
					  System.out.println("fail: no such user");
					  
				  }
				  else if(map.containsKey(username))
				  {
					  String p = map.get(username);
					  if(!p.equals(pass))
					  {
						  System.out.println("fail: incorrect password");
					  }
					  else if(list.contains(username))
					  {
						  System.out.println("fail: already logged in");
					  }
					  else if(p.equals(pass))
					  {
						  list.add(username);
						  System.out.println("success: user logged in");
					  }
				  }
				  
			  }
			  if(first.equals("logout"))
			  {
				  username =st.nextToken();
				  
				  if(!map.containsKey(username))
				  {
					  System.out.println("fail: no such user");
					  
				  }
				  else if(list.contains(username))
				  {
					  list.remove(username);
					  System.out.println("success: user logged out");
				  }
				  else
					  System.out.println("fail: already logged out");
				  
			  }
			  
		  }
		
	}

}
