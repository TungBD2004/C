import java.util.Scanner;

public class J01021_TichLuyThua {
    final static long mod = (long)1e9 + 7;
    static long poww(long a,long b){
        if(b == 0){
            return 1;
        }
        long tam = poww(a, b/2);
        if(b % 2 ==1){
            return (tam * tam % mod) *a % mod;
        }
        else
        return (tam*tam) % mod;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        while(1>0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(poww(a, b));
        }
        sc.close();
    }
}
