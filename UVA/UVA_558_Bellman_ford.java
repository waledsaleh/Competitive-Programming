import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UVA_558_Bellman_ford {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt(), m = sc.nextInt();

            List<PairVertex> adj = new ArrayList<>();

            for (int i = 0; i < m; ++i) {

                int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
                adj.add(new PairVertex(u, v, w));
            }

            int[] cost = new int[n];
            Arrays.fill(cost, Integer.MAX_VALUE);

            cost[0] = 0;

            for (int j = 0; j < m; ++j) {

                int u = adj.get(j).getU(), v = adj.get(j).getV(), w = adj.get(j).getW();

                if (cost[u] + w < cost[v]) {
                    cost[v] = cost[u] + w;
                }

            }

            boolean existCycle = false;

            for (int j = 0; j < m; ++j) {
                int u = adj.get(j).getU(), v = adj.get(j).getV(), w = adj.get(j).getW();

                if (cost[u] + w < cost[v]) {
                    existCycle = true;
                    break;
                }

            }


            System.out.println(existCycle ? "possible" : "not possible");

        }


    }
}

class PairVertex {

    private int u, v, w;

    PairVertex() {

    }

    public PairVertex(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    public int getU() {
        return u;
    }

    public int getW() {
        return w;
    }

    public int getV() {
        return v;
    }

}