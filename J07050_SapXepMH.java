import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07050_SapXepMH {
    static class MatHang{
        private int ma;
        private String ten,nhomHang;
        private double giaMua,giaBan;
        
        public MatHang() {
        }
        public MatHang(int ma, String ten, String nhomHang, double giaMua, double giaBan) {
            this.ma = ma;
            this.ten = ten;
            this.nhomHang = nhomHang;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }
        public double setLoiNhuan(){
            return giaBan - giaMua;
        }
        public void in(){
            System.out.printf("MH%02d ",ma);
            System.out.print(ten +" " +nhomHang );
            System.out.printf(" %.2f",setLoiNhuan());
            System.out.println();
        }
    }


    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<MatHang> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            a.add(new MatHang(i+1,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1,MatHang o2) {
                return (int)( o2.setLoiNhuan()- o1.setLoiNhuan());
            }
            
        });
        for(MatHang i :a){
            i.in();
        }
        sc.close();
    }
}
