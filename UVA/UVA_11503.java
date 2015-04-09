package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_11503 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String,Integer>m = new HashMap<String,Integer>();
			HashMap<Integer,String>m2 = new HashMap<Integer,String>();
			Set<String>s = new HashSet<String>();
			Vector<String>names  = new Vector<String>();
			
			for(int i = 0; i < n ;++i)
			{
				StringTokenizer st = new StringTokenizer(br.readLine());
				String f= st.nextToken(),sec=st.nextToken();
				s.add(f);
				s.add(sec);
				names.add(f+" "+sec);
				
				
			}
			Vector<String>v = new Vector<String>(s);
			for(int i = 0; i < v.size() ;++i)
			{
				String f = v.elementAt(i);
				if(!m.containsKey(f) || !m.containsValue(f)){
				m.put(f, i);
				m2.put(i, f);
				
				}
				
				
			}
			UnionFind u = new UnionFind(v.size());
			for(int i = 0; i <names.size() ;++i)
			{
		 	 StringTokenizer st = new StringTokenizer(names.elementAt(i));
				String n1 = st.nextToken(),n2=st.nextToken();
				u.unionSet(m.get(n1), m.get(n2));
				System.out.println(u.sizeOfSet(m.get(n1)));
			}
			
			
			
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
	      int ret = findSet(p.get(i)); p.set(i, ret);
	      return ret; } }

	  public Boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

	  public void unionSet(int i, int j) { 
	    if (!isSameSet(i, j)) { numSets--; 
	    int x = findSet(i), y = findSet(j);
	    // rank is used to keep the tree short
	    if (rank.get(x) > rank.get(y)) { p.set(y, x); setSize.set(x, setSize.get(x) + setSize.get(y)); }
	    else                           { p.set(x, y); setSize.set(y, setSize.get(y) + setSize.get(x));
	                                     if (rank.get(x) == rank.get(y)) rank.set(y, rank.get(y) + 1); } } }
	  public int numDisjointSets() { return numSets; }
	  public int sizeOfSet(int i) { return setSize.get(findSet(i)); }
	}

