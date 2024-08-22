import java.util.Scanner;

public class J02008_BoiSoCuaNSoNguyen {
    static long UCLN(long a,long b){
        if(b == 0){
            return a;
        }
        return UCLN(b, a % b);
    }
    static long BCNN(long a,long b){
        return (a/UCLN(a, b))*b;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n=sc.nextInt();
            long kq=1;
            for(int i=1;i<=n;i++){
                kq=BCNN(kq, i);
            }
            System.out.println(kq);

        }
        sc.close();
    }
}
