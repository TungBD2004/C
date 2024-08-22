import java.util.Scanner;
import java.math.BigInteger;
public class J03015_HieuHaiSoNguyenLon_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        BigInteger x = a.subtract(b);
        
        System.out.println(x);
        sc.close();
    }

}
