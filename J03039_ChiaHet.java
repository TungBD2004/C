import java.math.BigInteger;
import java.util.Scanner;

public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger kq = a.subtract(b);
            if(kq.longValue() >= 0){
                if(a.mod(b).longValue() == 0){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            else{
                if(b.mod(a).longValue() == 0){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
        sc.close();
    }
}
