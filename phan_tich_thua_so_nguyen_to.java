import java.util.Scanner;

public class phan_tich_thua_so_nguyen_to {
    public static Scanner sc = new Scanner(System.in);
    static int snt(int n) {
        if (n < 2) return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // tao bien count de in ra so bo test
        int count = 1;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.print("Test " + count++ + ": ");
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(snt(i) == 1) {
                    int dem = 0;
                    while (n % i == 0) {
                        dem++;
                        n = n / i;
                    }
                    // xet dem > 0 de phong truong hop dem = 0 va van in ra i(0)
                    if(dem > 0)
                        System.out.print(i + "(" + dem + ")" + " ");
                }
            }
            // neu n la so nguyen to thi in ra
            // khong can xet n >1 vì chi can la so nguyen to da co dieu kien > 1
            if(snt(n) == 1) System.out.print(n + "(1)");
            // sau bo test thi in ra \n
            System.out.println();
        }
    }
}
