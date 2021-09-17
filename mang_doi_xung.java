import java.util.Scanner;

public class mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int tmp = n-1, check = 1;
            for(int i = 0; i < n; i++){
                if(a[i] != a[tmp]){
                    check = 0;
                    break;
                }
                tmp--;
            }
            if(check == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
