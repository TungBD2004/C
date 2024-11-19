import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J05069_CauLacBoBongDa_1 {
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
        private String maTran;
        private long coDongVien;
        public tranDau(String maTran, long coDongVien) {
            this.maTran = maTran;
            this.coDongVien = coDongVien;
        }
        public String getMaCLB(){
            String kq= "" + maTran.charAt(1) +maTran.charAt(2);
            return kq;
        }
        public int getSTT(){
            int stt = maTran.charAt(3) - '0';
            return stt;
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
        int t1= sc.nextInt();
        sc.nextLine();
        tranDau [] b = new tranDau[t1];
        for (int i =0;i<t1;i++){
            b[i] = new tranDau(sc.next(), sc.nextLong());
        }
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
