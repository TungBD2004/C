import java.util.*;

public class J05067_QuanLyKhoXangDau {
    public static class CayXang{
        private String ma;
        private long sl;
        public CayXang(String ma, long sl) {
            this.ma = ma;
            this.sl = sl;
        }
        public long getDG(){
            String kq =""+ma.charAt(0);
            if(kq.equals("X")){
                return 128000;
            }
            else if(kq.equals("D")){
                return 11200;
            }
            else {
                return 9700;
            }
        }
        public long getThue(){
            String kq =""+ma.charAt(0);
            if(ma.endsWith("TN")){
                return 0;
            }
            else {
                if(kq.equals("X")){
                    return Math.round(getDG()*sl/100*3);
                }
                else if(kq.equals("D")){
                    return Math.round(getDG()*sl/100*3.5);
                }
                else {
                    return Math.round(getDG()*sl/100*2);
                }
            }
        }
        public String setHangSanXuat() {
            if (ma.endsWith("BP")) {
                return "British Petro";
            } else if (ma.endsWith("ES")) {
                return "Esso";
            } else if (ma.endsWith("SH")) {
                return "Shell";
            } else if (ma.endsWith("CA")) {
                return "Castrol";
            } else if (ma.endsWith("MO")) {
                return "Mobil";
            } else  {
                return  "Trong Nuoc";
            }
        }
        @Override
        public String toString() {
            return   ma + " " + setHangSanXuat() + " " + getDG() +" " +getThue() + " "
                    + (getDG()*sl + getThue());
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        CayXang [] a = new CayXang[t];
        for(int i = 0;i<t;i++){
            a[i] = new CayXang(sc.next(), Long.parseLong(sc.next()));
        }
        for ( CayXang i :a){
            System.out.println(i);
        }
    }
}
