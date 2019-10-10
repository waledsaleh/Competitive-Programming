import java.util.Scanner;

public class UVA_10452 {
    static String pathChar = "IEHOVA";

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int m = sc.nextInt(), n = sc.nextInt();

            char[][] ch = new char[m][n];

            int srcI = 0, srcJ = 0;

            for (int i = 0; i < m; ++i) {
                String line = sc.next();
                for (int j = 0; j < n; ++j) {
                    ch[i][j] = line.charAt(j);
                    if (line.charAt(j) == '@') {
                        srcI = i;
                        srcJ = j;
                    }
                }
            }

            checkPath(ch, srcI, srcJ, m, n, 0);
        }

    }

    public static boolean checkPath(char[][] grid, int srcI, int srcJ, int m, int n, int indx) {
        if (indx >= pathChar.length()) {
            if (srcJ < n && srcJ - 1 >= 0 && grid[srcI][srcJ - 1] == '#')
                System.out.println("left");
            else if (srcJ < n && srcJ + 1 < n && grid[srcI][srcJ + 1] == '#')
                System.out.println("right");
            else if (srcI < m && srcI - 1 >= 0 && grid[srcI - 1][srcJ] == '#')
                System.out.println("forth");

            return true;
        }

        if (srcJ < n && srcJ + 1 < n && grid[srcI][srcJ + 1] == pathChar.charAt(indx)) {
            System.out.print("right ");
            return checkPath(grid, srcI, srcJ + 1, m, n, indx + 1);
        }
        if (srcJ < n && srcJ - 1 >= 0 && grid[srcI][srcJ - 1] == pathChar.charAt(indx)) {
            System.out.print("left ");
            return checkPath(grid, srcI, srcJ - 1, m, n, indx + 1);
        } else {
            System.out.print("forth ");
            return checkPath(grid, srcI - 1, srcJ, m, n, indx + 1);
        }
    }

}
