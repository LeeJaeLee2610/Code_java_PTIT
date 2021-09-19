import java.util.Scanner;

public class diem_can_bang {
    public static int solution(int[] a, int n){
        int sum = 0, leftsum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
        }
        for(int i = 0; i < n; i++){
            sum -= a[i];
            if(sum == leftsum)
                return i + 1;
            leftsum += a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int res = solution(a, n);
            System.out.println(res);
        }
    }
}
