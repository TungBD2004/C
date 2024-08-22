import java.util.Scanner;

public class J01013_TongUocSo_1 {
    static int TongUoc(int a){
        int tong=0;
        for(int i=2;i<=a;i++){
            while(a % i == 0){
                tong+=i;
                a/=i;
            }
        }
        if(a>1){
            tong=a;
        }
        return tong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=1;
        while(t>0){
            int n=sc.nextInt();
            int [] a = new int[n];
            int kq=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                kq+=TongUoc(a[i]);
            }
            System.out.println(kq);
            t--;
        }
        sc.close();
    }
}
