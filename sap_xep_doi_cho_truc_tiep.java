import java.util.Scanner;

public class sap_xep_doi_cho_truc_tiep {
    public static Scanner sc = new Scanner(System.in);
    static void nhap(int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void xuat(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void In(int a[], int n) {
        n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    // swap arr[j+1] and arr[j]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }System.out.print("Buoc " + (i+1) + ": ");
            xuat(a, n);

        }
    }


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        nhap(a, n);
        In(a, n);

    }
}
