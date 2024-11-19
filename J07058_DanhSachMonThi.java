import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07058_DanhSachMonThi {
    static class MonHoc{
        private String ten,ma,hinhThucThi;

        public MonHoc() {
        }

        public MonHoc(String ma, String ten, String hinhThucThi) {
            this.ten = ten;
            this.ma = ma;
            this.hinhThucThi = hinhThucThi;
        }
        public void in(){
            System.out.println(ma + " " + ten +" " +hinhThucThi);
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a , new Comparator<MonHoc>() {

            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.ma.compareTo(o2.ma);
            }
            
        });
        for(MonHoc i : a){
            i.in();
        }
        sc.close();
    }
}
