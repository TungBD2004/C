import java.util.Scanner;

public class J01011_BoiSoChung_UocSoChung {
    public static long UCLN(long a,long b){
        if(b == 0){
            return a;
        }
        return UCLN(b , a % b);
    }
    public static long BCNN(long a,long b){
        return (a/UCLN(a, b))*b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long a =sc.nextLong();
            long b =sc.nextLong();
            System.out.println(BCNN(a,b) + " " + UCLN(a, b));  
            t--;

        }

        sc.close();
    }
}
