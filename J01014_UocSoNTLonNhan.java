import java.util.Scanner;

public class J01014_UocSoNTLonNhan {
    static int NTo(long a){
        if(a<2){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a % i ==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            long MAX=0;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    if( i > MAX && NTo(i) == 1){
                        MAX = i;
                    }
                    if( n/i > MAX && NTo(n/i) == 1){
                        MAX = n/i;
                    }
                }
                
            }
            if(MAX == 0){
                MAX=n;
            }
            System.out.println(MAX);

            t--;
        }
        sc.close();
    }
}
