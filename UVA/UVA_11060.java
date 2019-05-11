import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class UVA_11060 {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = 1;
        PrintWriter out = new PrintWriter(System.out);
        while (bufferedReader.ready()) {

            int n = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());

            Map<String, Integer> wordToNum = new HashMap<>();
            Map<Integer, String> numToWord = new HashMap<>();

            for (int i = 0; i < n; ++i) {
                String word = new StringTokenizer(bufferedReader.readLine()).nextToken();
                wordToNum.put(word, i);
                numToWord.put(i, word);
            }

            int m = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());

            List<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < n; ++i) adj.add(new ArrayList<>());

            int[] indegree = new int[101];

            StringTokenizer stringTokenizer;

            for (int i = 0; i < m; ++i) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());

                String u = stringTokenizer.nextToken(), v = stringTokenizer.nextToken();

                adj.get(wordToNum.get(u)).add(wordToNum.get(v));
                indegree[wordToNum.get(v)]++;
            }

            boolean[] vis = new boolean[101];
            Arrays.fill(vis, false);

            PriorityQueue<Integer> queue = new PriorityQueue();

            for (int i = 0; i < n; ++i) {
                if (indegree[i] == 0) {
                    queue.add(i);
                    vis[i] = true;
                }

            }

            List<Integer> topoSort = new ArrayList<>();

            while (!queue.isEmpty()) {
                int u = queue.poll();
                topoSort.add(u);
                for (int j = 0; j < adj.get(u).size(); ++j) {
                    if (!vis[adj.get(u).get(j)]) {

                        if (--indegree[adj.get(u).get(j)] == 0) {
                            queue.add(adj.get(u).get(j));
                            vis[adj.get(u).get(j)] = true;
                        }

                    }
                }

            }

            StringBuilder sb = new StringBuilder("");

            out.printf("Case #%d: Dilbert should drink beverages in this order: ", testCase++);

            for (int i = 0; i < topoSort.size(); ++i) {
                if (i == 0)
                    sb.append(numToWord.get(topoSort.get(i)));
                else
                    sb.append(" " + numToWord.get(topoSort.get(i)));
            }
            out.println(sb.toString() + ".\n");
            bufferedReader.readLine();
        }
        out.flush();
        out.close();

    }
}
