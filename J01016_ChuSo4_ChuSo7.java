import java.util.Scanner;

public class J01016_ChuSo4_ChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        int tong4 = 0;
        int tong7 = 0;
        while(n>0){
            if(n % 10 == 7){
                tong7++;
            }
            if(n % 10 == 4){
                tong4++;
            }
            n/=10;
        }
        int kq=tong4+tong7;
        
        if(kq == 4 || kq == 7){
            System.out.println("YES");
        }
        else System.out.println("NO");
        sc.close();
    }
}
