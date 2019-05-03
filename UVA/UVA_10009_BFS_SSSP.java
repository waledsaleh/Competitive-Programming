import java.io.IOException;
import java.util.*;

public class UVA_10009_BFS_SSSP {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int test = 0; test < t; ++test) {
            sc.nextLine();

            int n = sc.nextInt() + 1, m = sc.nextInt();

            Map<String, Integer> mapWordToNum = new HashMap<>();
            Map<Integer, String> mapNumToWord = new HashMap<>();

            List<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < n; ++i) adj.add(new ArrayList<>());

            int count = 0;

            for (int i = 1; i <= n - 1; ++i) {
                String a = sc.next(), b = sc.next();
                if (mapWordToNum.get(a) == null) {
                    mapNumToWord.put(count, a);
                    mapWordToNum.put(a, count++);
                }
                if (mapWordToNum.get(b) == null) {
                    mapNumToWord.put(count, b);
                    mapWordToNum.put(b, count++);
                }
                adj.get(mapWordToNum.get(a)).add(mapWordToNum.get(b));
                adj.get(mapWordToNum.get(b)).add(mapWordToNum.get(a));
            }

            if (test > 0)
                System.out.println();

            while (m-- > 0) {
                int source = mapWordToNum.get(sc.next()), dest = mapWordToNum.get(sc.next());

                int[] dis = new int[n];
                Arrays.fill(dis, Integer.MAX_VALUE);

                int[] pred = new int[n];
                Arrays.fill(pred, -1);

                Queue<Integer> queue = new LinkedList<>();
                queue.add(source);
                dis[source] = 0;

                boolean[] vis = new boolean[n];
                Arrays.fill(vis, false);

                vis[source] = true;

                while (!queue.isEmpty()) {

                    int v = queue.poll();

                    for (int i = 0; i < adj.get(v).size(); ++i) {
                        if (!vis[adj.get(v).get(i)]) {
                            vis[adj.get(v).get(i)] = true;
                            queue.add(adj.get(v).get(i));
                            dis[adj.get(v).get(i)] = dis[v] + 1;
                            pred[adj.get(v).get(i)] = v;
                            if (adj.get(v).get(i) == dest)
                                break;
                        }

                    }

                }

                List<Integer> path = new ArrayList<>();
                int parent = dest;
                path.add(parent);
                while (pred[parent] != -1) {
                    path.add(pred[parent]);
                    parent = pred[parent];
                }

                for (int i = path.size() - 1; i >= 0; --i) {
                    System.out.print(mapNumToWord.get(path.get(i)).charAt(0));
                }

                System.out.println();
            }

        }

    }
}
