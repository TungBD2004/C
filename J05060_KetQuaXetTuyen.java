import java.util.*;
public class J05060_KetQuaXetTuyen {
    static class PhuHo{
        private int ma;
        private String ten,ns;
        private double lt,th;
        public PhuHo(int ma, String ten, String ns, double lt, double th) {
            this.ma = ma;
            this.ten = ten;
            this.ns = ns;
            this.lt = lt;
            this.th = th;
        }
        public long getTuoi(){
            String [] kq = ns.split("/");
            long tuoi = (kq[2].charAt(0) - '0')*1000 + (kq[2].charAt(1) - '0')*100 + (kq[2].charAt(2) - '0')*10
            + (kq[2].charAt(3) - '0');
            return 2021-tuoi;
        }
        public double getThuong(){
            if(lt >=8 && th >=8){
                return 1;
            }
            else if(  (lt >=7.5) && th >=7.5){
                return 0.5;
            }
            else {
                return 0;
            }
        }
        public long getKq(){
            long kq = Math.round((double)(lt+th)/2 + getThuong());
            if(kq>=10){
                kq = 10;
            }
            return kq;
        }
        public String getXL(){
            if(getKq() >=9){
                return "Xuat sac";
            }
            else if( getKq() >=8){
                return "Gioi";
            }
            else if(getKq() >=7){
                return "Kha";
            }
            else if(getKq() >= 5){
                return "Trung binh";
            }
            else {
                return "Truot";
            }
        }
        @Override
        public String toString() {
            return String.format("PH%02d",ma)+ " " + ten + " " + getTuoi() + " " + getKq()
                    + " " + getXL();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        PhuHo [] a = new PhuHo[t];
        for(int i =0;i<t;i++){
            a[i] = new PhuHo(i+1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(a,new Comparator<PhuHo>() {
            @Override
            public int compare(PhuHo o1, PhuHo o2) {
                if(o1.getKq() != o2.getKq())
                return Long.compare(o2.getKq(),o1.getKq() );
                else {
                    return Integer.compare(o1.ma, o2.ma);
                }
            }
            
        });
        for ( PhuHo i :a){
            System.out.println(i);
        }
    }
}
