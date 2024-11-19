import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class J07075_LichGiangDayTheoGV {
    static class MonHoc{
        private String maMon,tenMon,stc;
        public MonHoc(String maMon, String tenMon, String stc) {
            this.maMon = maMon;
            this.tenMon = tenMon;
            this.stc = stc;
        }
        
    }
    static class Nhom implements Comparable<Nhom>{
        private int ma,thu,kip;
        private String maMon,tenGV,Phoc;
        public Nhom(int ma, String maMon, int thu, int kip, String tenGV, String phoc) {
            this.ma = ma;
            this.maMon = maMon;
            this.thu = thu;
            this.kip = kip;
            this.tenGV = tenGV;
            Phoc = phoc;
        }
        public int compareTo(Nhom o) {
            if(this.thu != o.thu){
                return Integer.compare(this.thu, o.thu);
            }
            if(this.kip != o.kip){
                return Integer.compare(this.kip, o.kip);
            }
            return this.tenGV.compareTo(this.tenGV);
        }
        
    }
    public static void main(String[] args) throws Exception{
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        int t= Integer.parseInt(sc1.nextLine());
        MonHoc [] a = new MonHoc[t];
        for(int i =0;i<t;i++ ){
            a[i] = new MonHoc(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
        }
        int t2=Integer.parseInt(sc2.nextLine());
        Nhom [] b = new Nhom[t2];
        for(int i =0; i<t2; i++){
            b[i] = new Nhom(i+1, sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()), sc2.nextLine(), sc2.nextLine());
        }
        Arrays.sort(b);
        String s = sc2.nextLine();
        for (Nhom i :b){
            if(i.tenGV.equals(s)){
                System.out.print("LICH GIANG DAY GIANG VIEN "+i.tenGV);
                System.out.println(":");
                break;
            }
        }
        for (Nhom i :b){
            if(i.tenGV.equals(s)){
                System.out.printf("HP%03d ",i.ma);
                for( MonHoc j:a){
                    if(i.maMon.equals(j.maMon) ){
                        System.out.print(j.tenMon+" ");
                        
                    }
                }
                System.out.println(i.thu +" " + i.kip +" " + i.Phoc);
            }
        }
    }
}
