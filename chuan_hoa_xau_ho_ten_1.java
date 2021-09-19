import java.util.Scanner;
import java.util.StringTokenizer;

public class chuan_hoa_xau_ho_ten_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

    public static String chuanHoa(String s){
        s = s.trim();
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder res = new StringBuilder();
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            res.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1;i<t.length();i++){
                res.append(Character.toLowerCase(t.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
}
