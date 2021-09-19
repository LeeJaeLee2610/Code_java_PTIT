import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class cap_so_co_tong_bang_k {
    static int xu_li(int n, int k, Vector <Integer> a)
    {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            if(!hm.containsKey(a.get(i)))
                hm.put(a.get(i), 0);
            hm.put(a.get(i), hm.get(a.get(i)) + 1);
        }
        int dem = 0;
        for(int i = 0; i < n; i++)
        {
            if(hm.get(k - a.get(i)) != null)
            {
                dem += hm.get(k - a.get(i));
            }
            if(k - a.get(i) == a.get(i))
            {
                dem -= 1;
            }
        }

        return dem/2;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Vector <Integer> a = new Vector<Integer>();
            for(int i = 0; i < n; i++)
            {
                int tmp = sc.nextInt();
                a.add(tmp);
            }
            System.out.println(xu_li(n, k, a));
            t -= 1;
        }
    }
}
