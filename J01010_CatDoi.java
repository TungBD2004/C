import java.util.Scanner;

public class J01010_CatDoi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            long kq=0;
            int ok=1;
            long so=1;
            while(n>0){
                if(n % 10 == 9 || n % 10 == 8 || n % 10 == 0 ){
                    kq += 0;
                }
                else if(n % 10 == 1){
                    kq = 1*so + kq;
                }
                else {
                    ok=0;
                    break;
                }
                n/=10;
                so*=10;
            }
            
            if(ok == 1 && kq != 0){
                System.out.println(kq);
            }
            else {
                System.out.println("INVALID");
            }
            t--;
        }
        sc.close();
    }
}
