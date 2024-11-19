import java.io.*;
import java.util.*;
public class J07038_DanhSachThucTap_3 {
    static String ChuanHoa(String s){
        s = s.toLowerCase().trim();
        String [] ss = s.split("\\s+");
        String kq="";
        for(int i=0;i<ss.length;i++){
            kq += Character.toUpperCase(ss[i].charAt(0)) + ss[i].substring(1);
            kq+=" ";
        }
        return kq;
    }
    static class SinhVien implements Comparable<SinhVien>{
        private String ma,ten,lop,email;
        public SinhVien(String ma, String ten, String lop,String email) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
        }
        @Override
        public String toString() {
            return  ma + " " + ChuanHoa(ten) + " " + lop;
        }
        @Override
        public int compareTo(SinhVien o) {
            return ma.compareTo(o.ma);
        }    
    }
    static class DoanhNghiep{
        private String ma,ten;
        private int soLuong;
        private ArrayList<SinhVien> sinhViens;
        public DoanhNghiep(String ma, String ten, int soLuong) {
            this.ma = ma;
            this.ten = ten;
            this.soLuong = soLuong;
            sinhViens = new ArrayList<>();
        }
        public ArrayList<SinhVien> getSinhViens() {
            return sinhViens;
        }
        public String toString() {
            String s = String.format("DANH SACH THUC TAP TAI %s:\n", ten);
            Collections.sort(sinhViens);
            while (soLuong < sinhViens.size()) sinhViens.remove(sinhViens.size() - 1);
            for (SinhVien x : sinhViens) s += (x.toString() + "\n");
            return s;
        }
        
    }
    public static void main(String[] args) throws Exception{
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DN.in"));
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));
        int n = sc1.nextInt();
        sc1.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String id = sc1.next();
            sc1.nextLine();
            String name = sc1.nextLine();
            String grade = sc1.next();
            String email = sc1.next();
            a.add(new SinhVien(id, name, grade, email));
        }
        int m = sc2.nextInt();
        ArrayList<DoanhNghiep> b = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            String id = sc2.next();
            sc2.nextLine();
            String name = sc2.nextLine();
            int numOfAvailableStudents = sc2.nextInt();
            b.add(new DoanhNghiep(id, name, numOfAvailableStudents));
        }
        int p = sc3.nextInt();
        while(p-->0){
            String studentId = sc3.next();
            String doanhNghiepId = sc3.next();
            for (DoanhNghiep x : b)
                if (x.ma.equals(doanhNghiepId)) {
                    for (SinhVien y : a)
                        if (y.ma.equals(studentId)) x.getSinhViens().add(y);
                }
        }
        int q = sc3.nextInt();
        while (q-- > 0) {
            String id = sc3.next();
            for (DoanhNghiep x : b)
                if (x.ma.equals(id)) {
                    System.out.print(x);
                    break;
                }
        }
        sc1.close();
        sc2.close();
        sc3.close();
    }
}
