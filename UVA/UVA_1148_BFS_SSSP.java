import java.io.IOException;
import java.util.*;

public class UVA_1148_BFS_SSSP {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int test = 0; test < t; ++test) {
            sc.nextLine();

            int n = sc.nextInt();

            List<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; ++i) adj.add(new ArrayList<>());

            boolean[] vis = new boolean[n];
            Arrays.fill(vis, false);

            for (int i = 0; i < n; ++i) {

                int x = sc.nextInt(), y = sc.nextInt();

                while (y-- > 0) {
                    int v = sc.nextInt();
                    adj.get(x).add(v);
                    adj.get(v).add(x);
                }

            }

            int c1 = sc.nextInt(), c2 = sc.nextInt();

            int[] des = new int[n];
            Arrays.fill(des, Integer.MAX_VALUE);

            int[] pred = new int[n];
            Arrays.fill(pred, -1);

            Queue<Integer> queue = new LinkedList<>();
            queue.add(c1);
            vis[c1] = true;
            des[c1] = 0;

            while (!queue.isEmpty()) {

                int x = queue.poll();
                if (x == c2)
                    break;

                for (int i = 0; i < adj.get(x).size(); ++i) {
                    if (!vis[adj.get(x).get(i)]) {
                        vis[adj.get(x).get(i)] = true;
                        des[adj.get(x).get(i)] = des[x] + 1;
                        pred[adj.get(x).get(i)] = x;
                        queue.add(adj.get(x).get(i));
                    }


                }


            }
            if (test > 0) System.out.println();

            System.out.println(c1 + " " + c2 + " " + (des[c2] - 1));

        }

    }

}
