import java.util.Scanner;

public class J01004_KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            
            if(n<2){
                System.out.println("YES");
            }
            else {
                int ok=1;
                for(int i=2;i<=Math.sqrt(n);i++){
                    if(n % i == 0){
                        ok=0;
                        break;
                    }
                }
                if(ok == 1 ){
                    System.out.println("YES");
                }  
                else System.out.println("NO");
                t--;
            }
            
        }
        sc.close();
    }
}
