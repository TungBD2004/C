import java.util.Scanner;

public class J01022_XauNhiPha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] f = new long[95];
        f[0] = 0;
        f[1] = f[2] = 1;
        for (int i = 3; i <= 92; ++i)
            f[i] = f[i - 1] + f[i - 2];
        long k;
        int n;
        String s="001";
        int t=sc.nextInt();
        while(t-- >0){
            n = sc.nextInt();
            k = sc.nextLong();
            while(n>2){
                if(k <= f[n-2]){
                    n-=2;
                }
                else{
                    k -= f[n-2];
                    n--;
                }
            }
            System.out.println(s.charAt(n));
        }
        sc.close();
    }
}
