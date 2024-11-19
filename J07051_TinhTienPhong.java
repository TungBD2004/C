import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J07051_TinhTienPhong {
    static String chuahoa(String s){
        s = s.toLowerCase().trim();
        String [] kq = s.split("\\s+");
        String luu ="";
        for(int i=0;i<kq.length;i++){
            luu+=Character.toUpperCase(kq[i].charAt(0)) + kq[i].substring(1);
            luu+= " ";
        }
        return luu;
    }
    static class KhachHang{
        private String ten,ngayNhan,ngayTra;
        private long ma,soPhong,tienPhatSinh,cost;
        private long date;
        public KhachHang() {
        }
        public KhachHang(long ma,String ten, long soPhong,String ngayNhan, String ngayTra, long tienPhatSinh) {
            this.ma= ma;
            this.ten = ten;
            this.soPhong = soPhong;
            this.ngayNhan = ngayNhan;
            this.ngayTra = ngayTra;
            this.tienPhatSinh = tienPhatSinh;
        }
        public String getTen() {
            return ten;
        }
        public void setTen(String ten) {
            this.ten = ten;
        }
        public String getNgayNhan() {
            return ngayNhan;
        }
        public void setNgayNhan(String ngayNhan) {
            this.ngayNhan = ngayNhan;
        }
        public String getNgayTra() {
            return ngayTra;
        }
        public void setNgayTra(String ngayTra) {
            this.ngayTra = ngayTra;
        }
        public long getMa() {
            return ma;
        }
        public void setMa(int ma) {
            this.ma = ma;
        }
        public long getSoPhong() {
            return soPhong;
        }
        public void setSoPhong(int soPhong) {
            this.soPhong = soPhong;
        }
        public long getTienPhatSinh() {
            return tienPhatSinh;
        }
        public void setTienPhatSinh(int tienPhatSinh) {
            this.tienPhatSinh = tienPhatSinh;
        }
        public long getCost() {
            return cost;
        }
        public void setCost() throws ParseException{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
            Date d1 = simpleDateFormat.parse(ngayNhan);
            Date d2 = simpleDateFormat.parse(ngayTra);
            
            long luu = Math.round((d2.getTime() - d1.getTime())/(60*60*24*1000));
            luu+=1;
            if(soPhong >=100 && soPhong <200){
                this.cost = luu * 25 + tienPhatSinh;
            }
            else if(soPhong >= 200 && soPhong <300){
                this.cost = luu * 34 + tienPhatSinh;
            }
            else if(soPhong >= 300 && soPhong <399){
                this.cost = luu * 50 + tienPhatSinh;
            }
            else if(soPhong >= 400){
                this.cost = luu * 80 + tienPhatSinh;
            }
        }
        public void setDate() throws ParseException{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date d1 = simpleDateFormat.parse(ngayNhan);
            Date d2 = simpleDateFormat.parse(ngayTra);
            long luu = Math.round((d2.getTime()- d1.getTime())/(60*60*24*1000));
            this.date = luu+1;
        }      
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        KhachHang [] a = new KhachHang[t];
        for(int i=0;i<t;i++){
            a[i] = new KhachHang(i+1,sc.nextLine(),Long.parseLong(sc.nextLine()),sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()));
            a[i].setCost();
            a[i].setDate();  
        }
        Arrays.sort(a,new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return (int)(o2.getCost()- o1.getCost());
            }
            
        });
        for(int i=0;i<t;i++){
            System.out.printf("KH%02d ",a[i].ma); 
            System.out.println(chuahoa(a[i].ten) + a[i].soPhong + " " + a[i].date + " " + a[i].cost);
        }
        sc.close();
        
    }
}
