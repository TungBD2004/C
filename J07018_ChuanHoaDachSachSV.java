import java.util.*;
import java.io.*;

public class J07018_ChuanHoaDachSachSV {
    static String ChuanHoa(String s){
        s = s.toLowerCase().trim();
        String [] arr = s.split("\\s+");
        String kq = "";
        for(int i=0;i<arr.length;i++){
            kq += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
            kq += " ";
        }
        return kq;
    }
    static class SinhVien{
        private int ma;
        private String ten,lop,ns;
        private double diem;
        public SinhVien(int ma, String ten, String lop, String ns, double diem) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.ns = ns;
            this.diem = diem;
        }
        public String getNs(){
            String [] kq = ns.split("/");
            String luu="";
            for(int i =0;i<kq.length-1;i++){
                if(kq[i].length()<2){
                    luu+="0";
                }
                luu+= kq[i] +"/";
            }   
            luu+=kq[kq.length-1];   
            return luu;
        }
        void in(){
            System.out.printf("B20DCCN%03d ",ma);
            System.out.print(ChuanHoa(ten) +" " + lop +" "+getNs()+" ");
            System.out.printf("%.2f",diem);
        }
        
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        SinhVien [] a = new SinhVien[t];
        for(int i=0;i<t;i++){
            a[i] = new SinhVien(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        }
        for(SinhVien i : a){
            i.in();
            System.out.println();
        }
    }
}
