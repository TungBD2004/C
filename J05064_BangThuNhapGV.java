import java.util.Scanner;

public class J05064_BangThuNhapGV {
    static class GV{
        private String ma,ten;
        private long luongCB;
        public GV(String ma, String ten, long luongCB) {
            this.ma = ma;
            this.ten = ten;
            this.luongCB = luongCB;
        }
        public String getCV(){
            String kq = "" +ma.charAt(0)+ma.charAt(1);
            return kq;
        }
        public long getChucVu(){
            String kq="" + ma.charAt(0)+ma.charAt(1);
            if(kq.equals("HT")){
                return 2000000;
            }
            else if(kq.equals("HP")){
                return 900000;
            }
            else return 500000;
        }
        public long getHSL(){
            return (ma.charAt(2)-'0')*10 + ma.charAt(3)-'0';
        }
        public  long getLuong(){
            return luongCB*getHSL() + getChucVu();
        }
        @Override
        public String toString() {
            return ma + " " + ten + " " + getHSL() +" " + getChucVu() + " " + getLuong();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GV [] a = new GV[n];
        sc.nextLine();
        for (int i =0;i<n;i++){
            a[i] = new GV(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        }
        int dem = 1;
        int dem1 = 0;
        for(int i =0;i<n;i++){
            if(a[i].getCV().equals("HT") && dem == 1){
                dem++;
                System.out.println(a[i]);
            }else if(a[i].getCV().equals("HP") & dem1 <2){
                dem1++;
                System.out.println(a[i]);
            }
            else if(a[i].getCV().equals("GV")){
                System.out.println(a[i]);
            }
        }
    }
}
