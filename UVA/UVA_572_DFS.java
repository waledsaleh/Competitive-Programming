import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UVA_572_DFS {
    static int dr[] = {1, 1, 0, -1, -1, -1, 0, 1}; // trick to explore an implicit 2D grid
    static int dc[] = {0, 1, 1, 1, 0, -1, -1, -1}; // S,SE,E,NE,N,NW,W,SW neighbors

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int m = sc.nextInt(), n = sc.nextInt();

            if (m == 0)
                break;

            char[][] ch = new char[m][n];

            boolean[][] vis = new boolean[m][n];
            for (int i = 0; i < m; ++i)
                Arrays.fill(vis[i], false);

            for (int i = 0; i < m; ++i) {
                String line = sc.next();

                for (int j = 0; j < n; ++j) {
                    ch[i][j] = line.charAt(j);
                }
            }

            int count = 0;

            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {

                    if (!vis[i][j] && ch[i][j] == '@') {
                        DFS(i, j, m, n, vis, ch);
                        ++count;
                    }

                }
            }

            System.out.println(count);
        }


    }

    static void DFS(int r, int c, int R, int C, boolean[][] vis, char[][] ch) {
        vis[r][c] = true;
        for (int i = 0; i < 8; ++i) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr < 0 || nr >= R || nc < 0 || nc >= C || vis[nr][nc] || ch[nr][nc] == '*')
                continue;

            DFS(nr, nc, R, C, vis, ch);

        }

    }
}
