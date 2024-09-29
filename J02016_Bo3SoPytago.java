import java.util.*;
public class J02016_Bo3SoPytago {
    static boolean KiemTra(long n){
        long x = (long) Math.sqrt(n);
        if(x*x == n)
        return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long [] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            HashSet<Long> se = new HashSet<>();
            for(int i=0;i<n;i++){
                long so =0;
                for(int j=i;j<n;j++){
                    so = a[i] * a[i] + a[j] * a[j];
                    if(KiemTra(so)){
                        se.add(so);
                    }
                }
            }
            int ok = 0;
            for(int i=0;i<n;i++){
                if(se.contains(a[i] * a[i])){
                    ok=1;
                    break;
                }
            }
            if(ok == 1){
                System.out.println("YES");;
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
