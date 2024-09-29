import java.util.Scanner;

public class J01024_SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n=sc.nextLong();
            int ok=0;
            while(n>0){
                if(n % 10 == 0 || n % 10 == 1 || n %10 == 2){
                    ok=1;
                }
                else{
                    ok=0;
                    break;
                }
                n/=10;
            }
            if(ok==1){
                System.out.println("YES");
            }
            else System.out.println("NO");
            
        }
        sc.close();
    }
}
