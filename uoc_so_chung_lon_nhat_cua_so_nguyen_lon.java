import java.util.Scanner;

public class uoc_so_chung_lon_nhat_cua_so_nguyen_lon {
    static long gcd(long a, long b)
    {
        if(a == 0)
        {
            return b;
        }
        return gcd(b%a, a);
    }

    static long xu_li(long a, String s)
    {
        long res = 0;
        for(int i = 0; i < s.length(); i++)
        {
            res = (res*10 + (s.charAt(i) - '0'))%a;
        }
        return res;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long a = sc.nextLong();
            String s = sc.next();
            long tmp = xu_li(a, s);
            long res = gcd(a, tmp);
            System.out.println(res);
        }
    }
}
