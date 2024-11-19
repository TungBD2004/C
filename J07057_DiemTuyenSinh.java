import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07057_DiemTuyenSinh {
    static String ChuanHoa(String s){
        s= s.toLowerCase().trim();
        String [] a =s.split("\\s+");
        String kq ="";
        for(int i=0;i<a.length;i++){
            kq += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
            kq+= " ";
        }
        return kq;
    }
    static class ThiSinh{
        private String ma;
        private String ten,danToc;
        private double diem;
        private int KV;
        public ThiSinh() {
        }
        public ThiSinh(int ma, String ten, double diem,String danToc, int KV) {
            this.ma = String.format("TS%02d", ma);
            this.ten = ten;
            this.danToc = danToc;
            this.diem = diem;
            this.KV = KV;
        }
        public double getDanToc(){
            if(danToc.equals("Kinh")){
                return 0;
            }
            else return 1.5;
        }
        public double getKV(){
            if(KV == 1){
                return 1.5;
            }
            else if(KV == 2){
                return 1;
            }
            else return 0;
        }
        public double getDiem(){
            return diem + getDanToc() + getKV();
        }
        public String getKQ(){
            if(getDiem() >= 20.5){
                return "Do";
            }
            else return "Truot";
        }
        public void in(){
            System.out.print(ma + " ");
            System.out.print(ChuanHoa(ten));
            System.out.printf("%.1f ",getDiem());
            System.err.println(getKQ());
        }

    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ThiSinh(i+1,sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a , new Comparator<ThiSinh>() {

            @Override
            public int compare(ThiSinh o1,ThiSinh o2) {
                if(o1.getDiem() == o2.getDiem()){
                    return o2.ma.compareTo(o1.ma);
                }
                else {
                    return Double.compare(o2.getDiem(), o1.getDiem());
                }
            }
            
        });
        for(ThiSinh i : a){
            i.in();
        }
        sc.close();
    }
}
