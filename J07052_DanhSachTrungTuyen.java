import java.io.File;
import java.util.*;
public class J07052_DanhSachTrungTuyen {
    static double diemChuan;
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
    static class ThiSinh{
        private String id,name;
        private double toan,ly,hoa,diemuutien;
        public ThiSinh() {
        }
        public ThiSinh(String id, String name, double toan, double ly, double hoa) {
            this.id = id;
            this.name = name;
            this.toan = toan;
            this.ly = ly;
            this.hoa = hoa;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public double getTotal() {
            Character kq ;
            kq= id.charAt(2);
            if(kq == '1'){
                return toan*2+ ly + hoa + 0.5;
            }
            else if(kq == '2'){
                return toan*2+ ly + hoa + 1;
            }
            else{
                return toan*2+ ly + hoa + 2.5;
            }
        }
        
        public double getDiemuutien() {
            Character kq ;
            kq = id.charAt(2);
            if(kq == '1'){
                return 0.5;
            }
            else if(kq == '2'){
                return 1;
            }
            else{
                return 2.5;
            }
        }
        public void setDiemuutien(double diemuutien) {
            this.diemuutien = diemuutien;
        }
        void in(){
            System.out.print(id +" " + ChuanHoa(name) + "");
            if(getDiemuutien()  == (int) ( getDiemuutien())){
                System.out.printf("%.0f ",getDiemuutien());
            }
            else{
                System.out.printf("%.1f ",getDiemuutien());
            }
            if(getTotal()  == (int) (  getTotal())){
                System.out.printf("%.0f ",getTotal());
            }
            else{
                System.out.printf("%.1f ",getTotal());
            }
            if(getTotal() >= diemChuan){
                System.out.println("TRUNG TUYEN");
            }
            else {
                System.out.println("TRUOT");
            }

        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ThiSinh [] a = new ThiSinh[n];
        
        for(int i=0;i<n;i++){
            a[i] = (new ThiSinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        int chiTieu=sc.nextInt();
        Arrays.sort(a, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if( (o1.getTotal() == o2.getTotal())){
                    return o1.getId().compareTo(o2.getId());
                }
                return (int) (o2.getTotal()-o1.getTotal());
            }  
        });
        diemChuan = a[chiTieu-1].getTotal();
        System.out.println(a[chiTieu-1].getTotal());
        for(ThiSinh i : a){
            i.in();
        }
        sc.close();
    }
}
