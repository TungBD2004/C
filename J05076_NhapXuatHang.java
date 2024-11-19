import java.util.Scanner;

public class J05076_NhapXuatHang {
    static class Hang{
        private String ma,ten,xepLoai;
        private long soLuongNhap,dgNhap,soLuongXuat;
        public Hang(String ma, String ten, String xepLoai) {
            this.ma = ma;
            this.ten = ten;
            this.xepLoai = xepLoai;
        }
        public long getTongNhap(){
            return soLuongNhap*dgNhap;
        }
        public long getTongXuat(){
            return soLuongXuat*dgNhap;
        }
        public long getLai(){
            if(xepLoai.equals("A")){
                return Math.round((double) getTongXuat()/100*8);
            }
            else if(xepLoai.equals("B")){
                return Math.round((double )getTongXuat()/100*5);
            }
            else{
                return Math.round(getTongXuat()/100*2);
            }
        }
        @Override
        public String toString() {
            return  ma + " " + ten + " " + getTongNhap() + " " + (getLai()+getTongXuat());
        }
        
    }
    static class IN{
        private String ma,ten;
        private long xuat,nhap;
        public IN(String ma, String ten, long xuat, long nhap) {
            this.ma = ma;
            this.ten = ten;
            this.xuat = xuat;
            this.nhap = nhap;
        }
        @Override
        public String toString() {
            return   ma + " " + ten + " " + xuat + " " + nhap ;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Hang [] a = new Hang[t];
        for (int i=0;i<t;i++){
            a[i] = new Hang(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int n =sc.nextInt();
        sc.nextLine();
        IN [] b = new IN[n];
        for(int j=0;j<n;j++){
            String s = sc.next();
            for(int i=0;i<t;i++){
                if(s.equals(a[i].ma)){
                    a[i].soLuongNhap =sc.nextLong();
                    a[i].dgNhap = sc.nextLong();
                    a[i].soLuongXuat = sc.nextLong();
                    b[j] = new IN(s, a[i].ten, a[i].getTongNhap(), a[i].getTongXuat()+a[i].getLai());
                    break;
                }
            }
        }
        for(IN i:b){
            System.out.println(i);
        }
    }
}
