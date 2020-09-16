import java.io.IOException;
import java.util.*;

public class UVA_1174_MST {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 1; i <= t; ++i) {

            sc.nextLine();

            if (i > 1)
                System.out.println();

            int m = sc.nextInt(), n = sc.nextInt(), indx = 0;

            List<EdgeLink> edgeLinks = new ArrayList<>();

            Map<String, Integer> wordToNum = new HashMap<>();
            for (int j = 0; j < n; ++j) {

                String a = sc.next(), b = sc.next();
                int w = sc.nextInt();

                if (wordToNum.get(a) == null)
                    wordToNum.put(a, indx++);
                if (wordToNum.get(b) == null)
                    wordToNum.put(b, indx++);

                edgeLinks.add(new EdgeLink(wordToNum.get(a), wordToNum.get(b), w));
            }

            int[] parent = new int[m];
            for (int k = 0; k < m; ++k) parent[k] = k;

            System.out.println(kruskalAlgo(parent, m, edgeLinks));

        }


    }

    static int findParent(int[] parent, int i) {

        if (parent[i] != i)
            parent[i] = findParent(parent, parent[i]);

        return parent[i];
    }

    static int kruskalAlgo(int[] parent, int m, List<EdgeLink> edgeLinks) {
        Collections.sort(edgeLinks);

        int V = m - 1, countMSTEdge = 0, nextEdge = 0, minCost = 0;

        while (countMSTEdge < V) {

            EdgeLink edgeLink = edgeLinks.get(nextEdge++);
            int xParent = findParent(parent, edgeLink.src);
            int yParent = findParent(parent, edgeLink.des);
            if (xParent != yParent) {
                minCost += edgeLink.weight;
                parent[xParent] = yParent;
                ++countMSTEdge;
            }

        }

        return minCost;
    }
}


class EdgeLink implements Comparable<EdgeLink> {

    int src, des, weight;

    EdgeLink() {
    }

    EdgeLink(int s, int d, int w) {
        this.src = s;
        this.des = d;
        this.weight = w;
    }

    @Override
    public int compareTo(EdgeLink o) {
        return this.weight - o.weight;
    }
}