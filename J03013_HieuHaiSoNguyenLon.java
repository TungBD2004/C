import java.util.Scanner;
import java.math.BigInteger;

public class J03013_HieuHaiSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger x = a.subtract(b);
            x = x.abs();
            String s = x.toString();
            String m = a.toString();
            String n = b.toString();

            int MAX = Math.max(m.length(), n.length());
            while(s.length() < MAX){
                s = "0" + s;
            }
            System.out.println(s);
        }
        sc.close();
    }
}
