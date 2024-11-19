import java.util.*;
import java.io.*;
public class J07055_XepLoai {
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
    static class SinhVien{
        private String ten;
        private int d1,d2,d3,ma;
        public SinhVien() {
        }
        public SinhVien( int ma,String ten, int d1, int d2, int d3) {
            this.ten = ten;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.ma = ma;
        }
        public double setDiem(){
            return (double) (d1*0.25 + d2*0.35 + d3*0.4);
        }
        public String setXepHang(){
            if(setDiem() >=8){
                return "GIOI";
            }
            else if(setDiem() >=6.5 && setDiem() <8){
                return "KHA";
            }
            else if(setDiem() < 6.5 && setDiem() >=5){
                return "TRUNG BINH";
            }
            else return "KEM";
        }
        public void in(){
            System.out.printf("SV%02d ",ma);
            System.out.print(ChuanHoa(ten));
            System.out.printf("%.2f ",setDiem());
            System.out.println(setXepHang());
        }
    }   
    
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0;i<t;i++){
            a.add(new SinhVien(i+1,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a ,new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o2.setDiem(), o1.setDiem());
            }
            
        });
        for(SinhVien i : a){
            i.in();
        }
        sc.close();

    }   
}
