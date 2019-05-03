import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UVA_929_Dijkstra_2D_Matrix {

    static int dr[] = {1, 0, -1, 0}; // trick to explore an implicit 2D grid
    static int dc[] = {0, 1, 0, -1}; // S,N,E,W neighbors

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        while (N-- > 0) {


            int n = Integer.parseInt(bufferedReader.readLine()), m = Integer.parseInt(bufferedReader.readLine());

            int[][] arr = new int[n][m];

            StringTokenizer stringTokenizer;

            for (int i = 0; i < n; ++i) {
                String split[] = bufferedReader.readLine().split(" ");
                for (int j = 0; j < m; ++j)
                    arr[i][j] = Integer.parseInt(split[j]);
            }

            int[][] cost = new int[n][m];
            for (int i = 0; i < n; ++i)
                Arrays.fill(cost[i], Integer.MAX_VALUE);

            PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(1, new Pair());
            priorityQueue.add(new Pair(0, 0, arr[0][0]));
            cost[0][0] = 0;

            while (!priorityQueue.isEmpty()) {

                Pair u = priorityQueue.poll();
                if (u.getRow() == n - 1 && u.getCol() == m - 1) {
                    System.out.println(u.getW());
                    break;
                }

                for (int i = 0; i < 4; ++i) {

                    int nr = u.getRow() + dr[i], nc = u.getCol() + dc[i];
                    if (nr < 0 || nc < 0 || nr >= n || nc >= m) continue;

                    int weight = cost[u.getRow()][u.getCol()] + arr[nr][nc];
                    if (weight < cost[nr][nc]) {
                        cost[nr][nc] = weight;
                        priorityQueue.add(new Pair(nr, nc, u.getW() + arr[nr][nc]));
                    }

                }

            }


        }


    }
}


class Pair implements Comparator<Pair> {

    private int row, col, w;

    Pair() {

    }

    Pair(int r, int c, int w) {
        this.row = r;
        this.col = c;
        this.w = w;
    }


    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.w - o2.w;
    }

    public int getRow() {
        return row;
    }


    public int getCol() {
        return col;
    }


    public int getW() {
        return w;
    }


}