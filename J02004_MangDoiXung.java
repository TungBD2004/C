import java.util.Scanner;

public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            long []a = new long[n+1];
            for(int i=0;i<n;i++){
               a[i] = sc.nextLong();
            }
            int ok=1;
            for(int i=0;i<n;i++){
                if(a[i] != a[n-i-1]){
                    ok=0;
                    break;
                }
            }
            if(ok == 1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}
