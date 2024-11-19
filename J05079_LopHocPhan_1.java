import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J05079_LopHocPhan_1 {
    public static class Lop{
        private String ma,tenLop,stt,ten;
        public Lop(String ma, String tenLop, String stt, String ten) {
            this.ma = ma;
            this.tenLop = tenLop;
            this.stt = stt;
            this.ten = ten;
        }
        @Override
        public String toString() {
            return stt + " " + ten;
        }
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Lop [] a = new Lop[t];
        for(int i=0;i<t;i++){
            a[i] = new Lop(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<Lop>() {

            @Override
            public int compare(Lop o1, Lop o2) {
                return o1.stt.compareTo(o2.stt);
            }
            
        });
        int k = sc.nextInt();
        sc.nextLine();
        while(k-->0){
            int ok =1;
            String s = sc.nextLine();
            for(int i=0;i<t;i++){
                if(s.equals(a[i].ma)){
                    if(ok == 1){
                        System.out.println("Danh sach nhom lop mon " + a[i].tenLop +":");
                        ok++;
                    }
                    System.out.println(a[i]);
                }   
            }
        }
    }
}
