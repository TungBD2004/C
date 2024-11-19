import java.util.*;
public class J05056_XepLoaiVDV_2 {
    public static class VDV{
        private int ma;
        private String ten,ns;
        private String xp,kt;
        public VDV(int ma, String ten,String ns, String xp, String kt) {
            this.ns = ns;
            this.ma = ma;
            this.ten = ten;
            this.xp = xp;
            this.kt = kt;
        }
        public int getTuoi(){
            String [] data = ns.split("/");
            return 2021 - Integer.parseInt(data[2]);
        }
        public long getThanhTich(){
            String [] data1 = xp.split(":");
            long start = Long.parseLong(data1[0])*3600+Long.parseLong(data1[1])*60+Long.parseLong(data1[2]);
            String [] data2 = kt.split(":");
            long end = Long.parseLong(data2[0])*3600+Long.parseLong(data2[1])*60+Long.parseLong(data2[2]);
            return end - start;
        }
        public long getUuTien(){
            if(getTuoi() >=32){
                return 3;
            }
            else if(getTuoi() >=25 && getTuoi() < 32){
                return 2;
            }
            else if(getTuoi() <25 && getTuoi() >=18){
                return 1;
            }
            else return 0;
        }
        public long getKq(){
            return getThanhTich()-getUuTien();
        }
        public String ChuanHoa(long s){
            return String.format("%02d:%02d:%02d", s/3600,(s%3600)/60,s%60);
        }
        @Override
        public String toString() {
            return String.format("VDV%02d ", ma)  + ten + " " + ChuanHoa(getThanhTich()) + " "
                    + ChuanHoa(getUuTien()) + " " + ChuanHoa(getKq()) + " ";
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        VDV [] a = new VDV[n];
        for(int i=0;i<n;i++){
            a[i] = new VDV(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());        
        }
        Arrays.sort(a, new Comparator<VDV>() {
            @Override
            public int compare(VDV o1, VDV o2) {
                return Long.compare(o1.getKq(), o2.getKq());
            }
            
        });
        int stt=1;
        System.out.println(a[0] + "" + stt);
        int dem = 1;
        for( int i =1;i<n;i++){
            if(a[i-1].getKq() == a[i].getKq()){
                System.out.println(a[i] + "" + stt);
                dem ++ ;
            }
            else {
                stt+=dem;
                dem = 1;
                System.out.println(a[i] +"" + stt);
            }
        }
    }
}
