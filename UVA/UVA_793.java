package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class UVA_793 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t =Integer.parseInt(br.readLine()); 
		br.readLine();
	
		 while(t-->0)
		 {
			
		 int n =Integer.parseInt(br.readLine());
		
		 UnionFind UF = new UnionFind(n);
		
		 int n1=0,n2=0;
		 String line = "";
		 while((line=br.readLine())!=null && !line.equals(""))
		 {
			 StringTokenizer st= new StringTokenizer(line);
			 String c = st.nextToken();
			 
			 int i = Integer.parseInt(st.nextToken()),j=Integer.parseInt(st.nextToken());
			 if(c.charAt(0)=='c')UF.unionSet(i-1, j-1);
			 else
			 {
				if(UF.isSameSet(i-1, j-1))n1++;
				else
					n2++;
				 
			 }
			 
		 }
		 
		  System.out.println(n1+","+n2);
		  if(t>0)System.out.println();
		  
	}
		 
		 
	}

}
class UnionFind {                                              // OOP style
	  private Vector<Integer> p, rank, setSize;
	  private int numSets;

	  public UnionFind(int N) {
	    p = new Vector<Integer>(N);
	    rank = new Vector<Integer>(N);
	    setSize = new Vector<Integer>(N);
	    numSets = N;
	    for (int i = 0; i < N; i++) {
	      p.add(i);
	      rank.add(0);
	      setSize.add(1);
	    }
	  }

	  public int findSet(int i) { 
	    if (p.get(i) == i) return i;
	    else {
	      int ret = findSet(p.get(i)); 
	      p.set(i, ret);
	      return ret; } }

	  public Boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

	  public void unionSet(int i, int j) { 
	    if (!isSameSet(i, j)) 
	    { 
	    	numSets--; 
	    int x = findSet(i), y = findSet(j);
	    // rank is used to keep the tree short
	    if (rank.get(x) > rank.get(y)) { p.set(y, x); setSize.set(x, setSize.get(x) + setSize.get(y)); }
	    else                           { p.set(x, y); setSize.set(y, setSize.get(y) + setSize.get(x));
	                                     if (rank.get(x) == rank.get(y)) rank.set(y, rank.get(y) + 1); } } }
	  public int numDisjointSets() { return numSets; }
	  public int sizeOfSet(int i) { return setSize.get(findSet(i)); }
	}
