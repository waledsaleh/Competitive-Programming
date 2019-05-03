import java.io.IOException;
import java.util.*;

public class UVA_10986_Dijkstra {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 1; i <= N; ++i) {

            int n = sc.nextInt(), m = sc.nextInt(), S = sc.nextInt(), T = sc.nextInt();

            List<ArrayList<IntegerPair>> adj = new ArrayList<>();

            for (int k = 0; k < n; ++k)
                adj.add(new ArrayList<>());

            while (m-- > 0) {
                int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
                adj.get(u).add(new IntegerPair(v, w));
                adj.get(v).add(new IntegerPair(u, w));
            }

            int[] dis = new int[n];
            Arrays.fill(dis, Integer.MAX_VALUE);

            PriorityQueue<IntegerPair> priorityQueue = new PriorityQueue<>(1, new IntegerPair());
            priorityQueue.add(new IntegerPair(S, 0));
            dis[S] = 0;

            while (!priorityQueue.isEmpty()) {
                IntegerPair u = priorityQueue.poll();

                for (int j = 0; j < adj.get(u.getNode()).size(); ++j) {

                    int weight = adj.get(u.getNode()).get(j).getCost(), v = adj.get(u.getNode()).get(j).getNode();

                    if (dis[u.getNode()] + weight < dis[v]) {
                        dis[v] = dis[u.getNode()] + weight;
                        priorityQueue.add(new IntegerPair(v, dis[v]));
                    }

                }


            }

            System.out.println(dis[T] != Integer.MAX_VALUE ? "Case #" + i + ": " + dis[T] : "Case #" + i + ": unreachable");
        }


    }
}

class IntegerPair implements Comparator<IntegerPair> {
    private Integer node, cost;

    public IntegerPair() {
    }

    public IntegerPair(Integer node, Integer cost) {
        this.node = node;
        this.cost = cost;
    }

    public int compare(IntegerPair node1, IntegerPair node2) {
        return node1.cost - node2.cost;
    }

    public Integer getNode() {
        return node;
    }


    public Integer getCost() {
        return cost;
    }


}
