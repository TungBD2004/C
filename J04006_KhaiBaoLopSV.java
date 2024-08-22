

import java.util.Scanner;

public class J04006_KhaiBaoLopSV {
    public static class SinhVien{
        private String maSV;
        private String name;
        private String ns;
        private double diem;
        private String lop;
        public SinhVien() {
        }
        public String getLop() {
            return lop;
        }
        public SinhVien(String maSV, String name, String ns, double diem) {
            this.maSV = maSV;
            this.name = name;
            this.ns = ns;
            this.diem = diem;
        }
        public String getMaSV() {
            return maSV;
        }
        public void setMaSV(String maSV) {
            this.maSV = maSV;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getNs() {
            return ns;
        }
        public void setNs(String ns) {
            this.ns = ns;
        }
        public double getDiem() {
            return diem;
        }
        public void setDiem(double diem) {
            this.diem = diem;
        }
        public void setLop(String lop){
            this.lop = lop;
        }
        public void in(){
            maSV = "B20DCCN001";
            String [] ss = ns.split("/");
            String kq="";
            for(int i=0;i<ss.length;i++){
                if(ss[i].length()<2){
                    kq+="0";
                }
                kq+=ss[i];
                if(i != 2)
                kq+="/";
            }
            ns=kq;
            System.out.print(maSV+" " + name +" " + lop +" " + ns );
            System.out.printf(" %.1f",diem);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien();
        a.setName(sc.nextLine());
        a.setLop(sc.nextLine());
        a.setNs(sc.nextLine());
        a.setDiem(sc.nextDouble());
        a.in();
        sc.close();
    }
}
