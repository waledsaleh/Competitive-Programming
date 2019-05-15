import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UVA_11631_MST {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int m, n;
        while ((m = sc.nextInt()) != 0 && (n = sc.nextInt()) != 0) {

            Edge edge[] = new Edge[n];
            Arrays.fill(edge, new Edge());

            int parent[] = new int[m];
            for (int i = 0; i < m; ++i) parent[i] = i;

            int totalCost = 0;
            for (int i = 0; i < n; ++i) {
                edge[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
                totalCost += edge[i].weight;
            }

            int minCost = kruskalAlgo(edge, parent);
            System.out.println(totalCost - minCost);
        }


    }

    public static int kruskalAlgo(Edge edge[], int parent[]) {
        Arrays.sort(edge);
        int V = parent.length;
        int countResult = 0, nextEdgeCounter = 0, minimumCost = 0;

        while (countResult < V - 1) {

            Edge nextEdge = edge[nextEdgeCounter++];

            int xParent = find(parent, nextEdge.src);
            int yParent = find(parent, nextEdge.des);

            if (xParent != yParent) { // cycle not exist
                minimumCost += nextEdge.weight;
                parent[xParent] = yParent;
                ++countResult;
            }
        }

        return minimumCost;
    }

    static int find(int parent[], int i) {
        if (parent[i] != i)
            parent[i] = find(parent, parent[i]);

        return parent[i];
    }


}



class Edge implements Comparable<Edge> {

    int src, des, weight;

    Edge() {
    }

    Edge(int src, int des, int weight) {
        this.src = src;
        this.des = des;
        this.weight = weight;
    }


    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }

}