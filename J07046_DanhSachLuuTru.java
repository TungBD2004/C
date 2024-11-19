import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class J07046_DanhSachLuuTru {
    static class LuuTru{
        private String  ten, maPhong, ngayDen, ngayDi;
        private long soNgayLuuTru;
        private int ma;
        public LuuTru() {
        }
        public LuuTru(int ma, String ten, String maPhong, String ngayDen, String ngayDi) {
            this.ma = ma;
            this.ten = ten;
            this.maPhong = maPhong;
            this.ngayDen = ngayDen;
            this.ngayDi = ngayDi;
        }
        public int getMa() {
            return ma;
        }
        public void setMa(int ma) {
            this.ma = ma;
        }
        public String getTen() {
            return ten;
        }
        public void setTen(String ten) {
            this.ten = ten;
        }
        public String getMaPhong() {
            return maPhong;
        }
        public void setMaPhong(String maPhong) {
            this.maPhong = maPhong;
        }
        public String getNgayDen() {
            return ngayDen;
        }
        public void setNgayDen(String ngayDen) {
            this.ngayDen = ngayDen;
        }
        public String getNgayDi() {
            return ngayDi;
        }
        public void setNgayDi(String ngayDi) {
            this.ngayDi = ngayDi;
        }
        public void setSoNgayLuuTru() throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
            Date t1 = simpleDateFormat.parse(ngayDen);
            Date t2 = simpleDateFormat.parse(ngayDi);
            long luu = (long) (t2.getTime() - t1.getTime()) / (1000 * 60 * 60 * 24);
            this.soNgayLuuTru = luu;
        }
    
        void in()  {   
            System.out.printf("KH%02d ",getMa());    
            System.out.println(ten+ " " + maPhong +" " + soNgayLuuTru );
        }
    }
    public static void main(String[] args) throws Exception, ParseException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        LuuTru [] a = new LuuTru[t];
        for(int i=0;i<t;i++){
            a[i] = new LuuTru(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a[i].setSoNgayLuuTru();
        }
        Arrays.sort(a, new Comparator<LuuTru>() {
            @Override
            public int compare(LuuTru o1,LuuTru o2) {
                return (int)(o2.soNgayLuuTru - o1.soNgayLuuTru);
            }
        });
        for (int i = 0; i < t; i++) {
            a[i].in();
        }   
        sc.close();
    }
}
