import java.util.Scanner;

public class J04015_TinhThuNhapGiaoVien {
    static class GiaoVien{
        private String maNgach;
        private String name;
        private int bacLuong;
        private long phuCap;
        private long luong;
        public GiaoVien() {
        }
        public GiaoVien(String maNgach, String name, int bacLuong, long phuCap, long luong) {
            this.maNgach = maNgach;
            this.name = name;
            this.bacLuong = bacLuong;
            this.phuCap = phuCap;
            this.luong = luong;
        }
        public String getMaNgach() {
            return maNgach;
        }
        public void setMaNgach(String maNgach) {
            this.maNgach = maNgach;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getBacLuong() {
            return bacLuong;
        }
        public void setBacLuong(int bacLuong) {
            this.bacLuong = bacLuong;
        }
        public long getPhuCap() {
            return phuCap;
        }
        public void setPhuCap(long phuCap) {
            this.phuCap = phuCap;
        }
        public long getLuong() {
            return luong;
        }
        public void setLuong(long luong) {
            this.luong = luong;
        }
        void in(){
            int heso=0;
            String tam="";
            tam= tam + maNgach.charAt(0) + maNgach.charAt(1);
            for(int i=2;i<4;i++){
                heso = heso*10 + maNgach.charAt(i)-'0' ;
            }
            if(tam.equals("HT")){
                phuCap = 2000000;
            }
            else if(tam.equals("HP")){
                phuCap = 900000;
            }
            else if(tam.equals("GV")) phuCap = 500000;
            bacLuong = heso;
            System.out.println(maNgach + " " + name +" " + bacLuong +" " +phuCap +" "+(luong*bacLuong+phuCap));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien a = new GiaoVien();
        a.setMaNgach(sc.nextLine());
        a.setName(sc.nextLine());
        a.setLuong(sc.nextLong());
        a.in();
        sc.close();
    }
}
