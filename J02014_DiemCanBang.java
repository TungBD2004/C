import java.util.Scanner;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int [] a = new int[n];
            int tong = 0;
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                tong+=a[i];
            }
            
            int kq=0;
            int ok=0;
            for(int i=0;i<n;i++){
                kq+=a[i];
                if(kq-a[i] == (tong - a[i]) / 2){
                    System.out.println(i+1);
                    ok=1;
                    break;
                }
            }
            if(ok == 0){
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
