import java.util.Scanner;

public class J04004_TongPhanSo {
    static long GCD(long a,long b){
        if(b == 0){
            return a;
        }
        return GCD(b, a % b);
    }
    static class PhanSo{
        private long tu;
        private long mau;
        public PhanSo() {
        }
        public PhanSo(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
        }
        public long getTu() {
            return tu;
        }
        public void setTu(long tu) {
            this.tu = tu;
        }
        public long getMau() {
            return mau;
        }
        public void setMau(long mau) {
            this.mau = mau;
        }
        public void rutgon(PhanSo p){
            long MSC = GCD(p.tu, p.mau);
            p.tu/=MSC;
            p.mau/=MSC;
            System.out.println(p.tu+"/"+p.mau);
        }
        public PhanSo tongPS(PhanSo a, PhanSo b){
            PhanSo c = new PhanSo();
            c.tu=a.tu*b.mau+b.tu*a.mau;
            c.mau=a.mau*b.mau;
            return c;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a.setTu(sc.nextLong());
        a.setMau(sc.nextLong());
        b.setTu(sc.nextLong());
        b.setMau(sc.nextLong());
        PhanSo c = new PhanSo();
        c=c.tongPS(a, b);
        c.rutgon(c);
        sc.close();
    }
}
