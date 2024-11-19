import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J05070_CLBBongDa_2 {
    static class CLB{
        private String maCLB,ten;
        private long giaVe;
        public CLB(String maCLB, String ten, long giaVe) {
            this.maCLB = maCLB;
            this.ten = ten;
            this.giaVe = giaVe;
        }
    }
    static class tranDau{
        CLB o; 
        private String maTran;
        private long coDongVien;
        public tranDau(CLB o,String maTran, long coDongVien) {
            this.maTran = maTran;
            this.coDongVien = coDongVien;
            this.o = o;
        }
        public String getMaCLB(){
            String kq= "" + maTran.charAt(1) +maTran.charAt(2);
            return kq;
        }
        public int getSTT(){
            int stt = maTran.charAt(3) - '0';
            return stt;
        }
        public long getKQ(){
            return o.giaVe*coDongVien;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        CLB [] a = new CLB[t];
        for (int i=0;i<t;i++){
            a[i] = new CLB(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())); 
        }
        Arrays.sort(a, new Comparator<CLB>() {
            @Override
            public int compare(CLB o1, CLB o2) {
                return o1.ten.compareTo(o2.ten);
            }      
        });
        int t1= sc.nextInt();
        sc.nextLine();
        tranDau [] b = new tranDau[t1];
        for (int i =0;i<t1;i++){
            b[i] = new tranDau(a[i], sc.next(), sc.nextLong());
        }
        Arrays.sort(b, new Comparator<tranDau>() {
            public int compare(tranDau o1, tranDau o2){
                return Long.compare(o2.getKQ(), o1.getKQ());
            }
        });
        for (int i =0;i<t1;i++){
            for (int j =0 ;j<t;j++){
                if(b[i].getMaCLB().equals(a[j].maCLB)){
                    System.out.println(b[i].maTran  +" "+a[j].ten +" "+(a[j].giaVe*b[i].coDongVien));
                    break;
                }
            }
        }
    }
}
