import java.util.Scanner;

public class J04003_PhanSo {
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
        public void rutgon(){
            long MSC = GCD(tu, mau);
            tu/=MSC;
            mau/=MSC;
            System.out.println(tu+"/"+mau);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p = new PhanSo();
        p.setTu(sc.nextLong());
        p.setMau(sc.nextLong());
        p.rutgon();
        sc.close();
    }
}
