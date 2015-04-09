package Main;

 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;
 
public class UVA_459{
static int count =0;
static boolean vis[]=new boolean[26];
static Vector<Vector<Integer>>g;
 
public static void main(String[] args) throws IOException {
 
   Scanner sc = new Scanner(System.in);
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int test = Integer.parseInt(br.readLine());
  br.readLine();
   int c = 1;
   while(test-->0)
   {
 
 
    String max = br.readLine();
   int len =max.charAt(0)-('A'-1);
 
   g=new Vector<Vector<Integer> >();
 
   for(int i=0;i<len;++i)vis[i]=false;
 
    for(int i = 0 ; i < len ;++i)g.add(new Vector<Integer>());
    String read;
 
    while((read=br.readLine())!=null && read.length()>0)
   {
    StringTokenizer st = new StringTokenizer(read);
      String str=st.nextToken();
    int first = (int)(str.charAt(0)-'A');
    int sec =(int)(str.charAt(1)-'A');
    g.get(first).add(sec);
    g.get(sec).add(first);
 
    }
 
    int count =0;
 
   for(int i=0;i<len;++i){
    if(!vis[i]){
   DFS(i);
     ++count;
 
    }
 
   }
 
   System.out.println(count);
 
   if(test>0)
    System.out.println("");
 
 
   g.clear();
 
 }
 
 
}
 
   static void DFS(int u)
   {
   vis[u]=true;
   for(int i=0;i<g.get(u).size();++i)
   if(!vis[g.get(u).get(i)])
   DFS(g.get(u).get(i));
   
   }
   
}
 