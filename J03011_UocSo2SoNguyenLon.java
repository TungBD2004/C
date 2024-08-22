import java.util.Scanner;

public class J03011_UocSo2SoNguyenLon {

    static long chuyen(long a,String b){
        long kq =0 ;
        for(int i=0;i<b.length();i++){
            kq = kq*10 + b.charAt(i ) - '0';
            kq %= a;
        }
        return kq;
    }
    static long UCLN(long a,long b){
        if(b == 0){
            return a;
        }
        return UCLN(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc. nextInt();
        while( t-- > 0){
            long a=sc.nextLong();
            String b= sc.next();
            long tam=chuyen(a, b);
            System.out.println(UCLN(tam, a));
        }
        sc.close();
    }
}
