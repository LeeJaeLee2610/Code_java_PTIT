import java.util.Scanner;

public class tich_ma_tran_chuyen_vi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int count = 1;
        while(test-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    b[i][j] = a[j][i];
                }
            }
            int[][] res = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < m; k++){
                        res[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Test " + count++ + ": ");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
