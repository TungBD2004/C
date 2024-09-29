import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long kq=0;
        for(int i=1;i<=n;i++){
            long tong=1;
            for(int j=1;j<=i;j++){
                tong*=j;
            }
            kq+=tong;
        }
        System.out.println(kq);
        sc.close();
    }
}
