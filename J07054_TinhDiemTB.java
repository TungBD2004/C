import java.io.File;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07054_TinhDiemTB {

    static String ChuanHoa(String s){
        s = s.toLowerCase().trim();
        String [] array = s.split("\\s+");
        String kq = "";
        for(int i=0;i<array.length;i++){
            kq += Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1);
            kq+=" ";
        }
        return kq;
    }
    static class SinhVien{
        private String ten;
        private int d1,d2,d3,ma,rank;
        public SinhVien() {
        }
        public SinhVien(int ma,String ten, int d1, int d2, int d3) {
            this.ma = ma;
            this.ten = ten;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }
        public double getDiem(){
            return (double) (d1*3 + d2*3+ d3*2)/8;
        }
        
        public int getRank() {
            return rank;
        }
        public void setRank(int rank) {
            this.rank = rank;
        }
        public void in(){
            System.out.printf("SV%02d ",ma);
            System.out.print(ChuanHoa(ten) );
            System.out.printf("%.2f ",getDiem());
            System.out.println(getRank());
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = sc.nextInt();
        sc.nextLine();
        SinhVien [ ] a = new SinhVien[t];
        for(int i=0;i<t;i++){
            a[i] = (new SinhVien(i+1,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Arrays.sort(a, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiem() != o2.getDiem()) {
                    return Double.compare(o2.getDiem(), o1.getDiem());
                }
                return Integer.compare(o1.ma, o2.ma);
                
            }     
        });
        int so =1;
        a[0].setRank(so);
        a[0].in();
        for(int i=1;i<t;i++){
            if(a[i].getDiem() == a[i-1].getDiem()){
                a[i].setRank(a[i-1].getRank());
            }
            else {
                a[i].setRank(i+1);
            }
            a[i].in();
            
        }
        sc.close();
    }
}
