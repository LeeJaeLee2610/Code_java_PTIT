import java.util.Scanner;

public class lcm_gcd {
    static int gcd(int a, int b)
    {
        if(a == 0)
        {
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            t -= 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }
    }
