import java.io.IOException;
import java.util.*;

public class UVA_10600_MST {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt();

            List<GraphEdge> edge = new ArrayList<>();

            SortedSet sortedSet = new TreeSet();

            int parent[] = new int[m + 1];
            for (int i = 1; i < parent.length; ++i) parent[i] = i;

            boolean[] offEdge = new boolean[n];

            for (int i = 0; i < n; ++i) {
                edge.add(new GraphEdge(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                offEdge[i] = false;
            }

            Collections.sort(edge);

            int minCost = kruskalAlgo(edge, parent, n, m, offEdge);

            for (int i = 0; i < n; ++i) {
                if (offEdge[i])
                    secondMST(sortedSet, m, n, parent, edge, i);

            }

            System.out.println(minCost + " " + sortedSet.first());
        }
    }

    static void secondMST(SortedSet sortedSet, int m, int n, int[] parent, List<GraphEdge> edge, int i) {
        int secCost = 0, countEdge = 0;
        //reset union-set ds
        for (int k = 1; k < parent.length; ++k) parent[k] = k;

        for (int j = 0; j < n; ++j) {
            int xParent = find(parent, edge.get(j).src);
            int yParent = find(parent, edge.get(j).des);
            if (xParent != yParent && i != j) {
                secCost += edge.get(j).weight;
                parent[xParent] = yParent;
                ++countEdge;
            }
        }

        if (countEdge == m - 1)
            sortedSet.add(secCost);

    }

    public static int kruskalAlgo(List<GraphEdge> edge, int parent[], int n, int m, boolean[] offEdge) {
        int countResult = 0, nextEdgeCounter = 0, minimumCost = 0;

        for (int i = 0; i < n; ++i) {

            GraphEdge nextEdge = edge.get(nextEdgeCounter++);

            int xParent = find(parent, nextEdge.src);
            int yParent = find(parent, nextEdge.des);

            if (xParent != yParent) { // cycle not exist
                minimumCost += nextEdge.weight;
                parent[xParent] = yParent;
                offEdge[i] = true;
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


class GraphEdge implements Comparable<GraphEdge> {

    int src, des, weight;

    GraphEdge() {
    }

    GraphEdge(int src, int des, int weight) {
        this.src = src;
        this.des = des;
        this.weight = weight;
    }


    @Override
    public int compareTo(GraphEdge o) {
        return this.weight - o.weight;
    }

}