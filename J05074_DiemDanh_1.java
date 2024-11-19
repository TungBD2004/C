import java.util.Scanner;

public class J05074_DiemDanh_1 {
    static class HocSinh{
        private String ma,ten,lop,diemdanh;

        public HocSinh(String ma, String ten, String lop) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
        }
        public int getDiem(){
            int diem =10;
            for(int i = 0;i<diemdanh.length();i++){
                String kq=""+diemdanh.charAt(i);
                if(kq.equals("v")){
                    diem-=2;
                }
                else if(kq.equals("m")){
                    diem-=1;
                }
                kq="";
            }
            if(diem <0){
                diem =0;
            }
            return diem;
        }
        public String getChuY(){
            if(getDiem() == 0){
                return "KDDK";
            }
            else return "";
        }
        @Override
        public String toString() {
            return ma + " " + ten + " " + lop + " " + getDiem() + " "
                    + getChuY();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        HocSinh [] a = new HocSinh[t];
        for (int i=0;i<t;i++){
            a[i] = new HocSinh(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for(int i = 0;i<t;i++){
            String ma = sc.next();
            for(int j =0;j<t;j++){
                if(ma.equals(a[j].ma)){
                    a[j].diemdanh = sc.nextLine();
                    break;
                }
            }
        }
        String x = sc.nextLine();
        for(int i =0;i<t;i++){
            if(a[i].lop.equals(x)){
                System.out.println(a[i]);
            }
        }
    }
}
