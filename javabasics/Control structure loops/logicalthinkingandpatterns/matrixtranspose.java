package logicalthinkingandpatterns;
import java.io.*;

public class matrixtranspose{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter rows and columns: ");
        String[] rc = br.readLine().split(" ");
        int r = Integer.parseInt(rc[0]), c = Integer.parseInt(rc[1]);
        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < c; j++) a[i][j] = Integer.parseInt(row[j]);
        }

        System.out.println("Transpose:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }
}
