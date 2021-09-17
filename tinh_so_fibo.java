import java.util.Scanner;

public class tinh_so_fibo {
    public long fibo(long n)
    {
        long f1 = 0;
        long f2 = 1;
        long fn = 1;
        if(n < 2)
        {
            return n;
        }
        for(long i = 2; i <= n; i++)
        {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        tinh_so_fibo tmp = new tinh_so_fibo();
        int t = sc.nextInt();
        while(t > 0)
        {
            t -= 1;
            long n = sc.nextInt();
            System.out.println(tmp.fibo(n));
        }
    }
}
