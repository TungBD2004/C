import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07053_XetTuyen {
    static String ChuanHoa(String s){
        s = s.toLowerCase().trim();
        String [] a = s.split("\\s+");
        String kq = "";
        for(int i=0;i<a.length;i++){
            kq += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
            kq += " ";
        }
        return kq;
    }

    static class XetTuyen{
        private String ten,ns;
        private double d1,d2;
        private int ma;
        public XetTuyen() {
        }
        public XetTuyen(int ma,String ten, String ns, double d1, double d2) {
            this.ma = ma;
            this.ten = ten;
            this.ns = ns;
            this.d1 = d1;
            this.d2 = d2;
        }
        public double getThuong(){
            if(d1 >= 8 && d2 >=8){
                return  1;
            }
            else if(d1 >= 7.5 && d2 >=7.5  ){
                return 0.5;
            }
            else {
                return 0;
            }
        }
        public int getDiem(){
            int x = (int) Math.round((d1+d2)/2 + getThuong());
            if(x > 10){
                return 10;
            }
            return x;
        }
        public String XepLoai(){
            int res = getDiem();
            if(res >= 9) return "Xuat sac";
            else if(res == 8) return "Gioi";
            else if(res == 7) return "Kha";
            else if(res == 6 || res == 5) return "Trung binh";
            else return "Truot";
        }
        public int getTuoi(){
            int tuoi = 0;
            
            for(int i=ns.length()-4;i<ns.length();i++){
                tuoi = tuoi * 10 + (ns.charAt(i) -'0');
            }
            return 2021 - tuoi;
        }
       public void in(){
            System.out.printf("PH%02d ",ma);
            System.out.println(ChuanHoa(ten) + "" + getTuoi() + " " + getDiem() + " " +XepLoai());
       }

    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("XETTUYEN.IN"));
        ArrayList<XetTuyen> a = new ArrayList<>();
        int t =Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            a.add(new XetTuyen(i+1,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }  
        for(XetTuyen i :a){
            i.in();
        }  
        sc.close();
    }
}
