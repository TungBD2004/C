import java.util.Scanner;

public class J01007_KiemTraSoFIbo {
    
    static int Kiemtra(long a){
        long [] f = new long[100];
        if(a == 0 || a == 1 || a==2){
            return 1;
        }
        f[0]=0;
        f[1]=f[2]=1;
        for(int i=3;i<=92;i++){
            f[i]=f[i-1]+f[i-2];
            if(f[i] == a){
                return 1;
            }
        }
    return 0;    

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            if(Kiemtra(n) == 1){
                System.out.println("YES");
            }
            else System.out.println("NO");


            t--;
        }
        sc.close();
    }

    
}
