package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UVA_10986_Dijkastra {
	
	  public static final int INF = 1000000000;
	  private static Vector< Vector< IntegerPair > > AdjList = new Vector< Vector< IntegerPair > >();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		          
                   StringBuilder sb = new StringBuilder("");
                   int count=1;
		            int test = Integer.parseInt(br.readLine());;
		            while(test-->0)
		            {
		            int V, E, s, u, v, w;   
		            StringTokenizer st = new StringTokenizer(br.readLine());
		            V = Integer.parseInt(st.nextToken());
		            E = Integer.parseInt(st.nextToken());
		            s = Integer.parseInt(st.nextToken());
	                u=Integer.parseInt(st.nextToken());
	                
	                int get = u;
		            AdjList.clear();
		            for (int i = 0; i < V; i++) {
		              Vector< IntegerPair > Neighbor = 
		                new Vector < IntegerPair >();
		              AdjList.add(Neighbor); // add neighbor list to Adjacency List
		            }
		            
		            for (int i = 0; i < E; i++) {
		            	 st = new StringTokenizer(br.readLine());
		                u = Integer.parseInt(st.nextToken());
		                v = Integer.parseInt(st.nextToken());
		                w = Integer.parseInt(st.nextToken());
		                AdjList.get(u).add(new IntegerPair (v, w)); // first time using weight
		                AdjList.get(v).add(new IntegerPair (u, w));
		              }
		            //st = new StringTokenizer(br.readLine());
               
                
		            Vector < Integer > dist = new Vector < Integer > ();
		            dist.addAll(Collections.nCopies(V, INF)); dist.set(s, 0); // INF = 1*10^9 not MAX_INT to avoid overflow
		            PriorityQueue < IntegerPair > pq = new PriorityQueue < IntegerPair >(1, 
		              new Comparator< IntegerPair >() { // overriding the compare method 
		                public int compare(IntegerPair i, IntegerPair j) {
		                  return i.first() - j.first();
		                }
		              }
		            );
		            pq.offer(new IntegerPair (0, s)); // sort based on increasing distance

		            while (!pq.isEmpty()) { // main loop
		              IntegerPair top = pq.poll(); // greedy: pick shortest unvisited vertex
		              int d = top.first(); u = top.second();
		              if (d > dist.get(u)) continue; // This check is important! We want to process vertex u only once but we can
		              Iterator it = AdjList.get(u).iterator();
		              while (it.hasNext()) { // all outgoing edges from u
		                IntegerPair p = (IntegerPair) it.next();
		                v = p.first();
		                int weight_u_v = p.second();
		                if (dist.get(u) + weight_u_v < dist.get(v)) { // if can relax      (note: Record SP spanning tree)
		                  dist.set(v, dist.get(u) + weight_u_v); // relax                  (here if needed. This is similar)
		                  pq.offer(new IntegerPair(dist.get(v), v)); //      (as printpath in BFS)
		                  // enqueue this neighbor regardless whether it is already in pq or not    
		            } } }
		          
		         if(dist.get(get)==INF)sb.append("Case #"+count+": unreachable\n");
		         else
		             sb.append("Case #"+count+": "+dist.get(get)+"\n");
		            
		         count++;
		            }
	
		             System.out.print(sb);
		            
	}

}
