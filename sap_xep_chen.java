import java.util.Scanner;

public class sap_xep_chen {
    public static Scanner sc=new Scanner(System.in);
    static void InMang(int a[],int n){
        for(int i=0;i<=n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void SxChen(int a[],int n) {
        // in ra phan tu dau tien va buoc dau tien
        System.out.println("Buoc 0: " + a[0]);
        int index, value, count = 0;
        // xet tiep tu phan tu thu 2
        // neu su dung i = 0 thi phai xet la a[i +1] vì khong xet phan tu dau tien nua
        for (int i = 1; i < n; i++) {
            index = i - 1;
            value = a[i];
            while (index >= 0 && a[index] > value) {
                a[index+1] = a[index ];
                index--;
            }
            a[index+1] = value;
            count++;
            // in ra mang da sap xep
            System.out.print("Buoc " + i + ": ");
            InMang(a, count);
        }
    }

    public static void main (String[]args){
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        SxChen(a, n);
    }
}
