import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J05080_LopHocPhan_2 {
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
            return ma + " " + tenLop+" " +stt;
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
                if(o1.ma.equals(o2.ma) == false)
                    return o1.ma.compareTo(o2.ma);
                else return o1.stt.compareTo(o2.stt);
            }  
        });
        int k = sc.nextInt();
        sc.nextLine();
        while(k-->0){
            int ok =1;
            String s = sc.nextLine();
            for(int i=0;i<t;i++){
                if(s.equals(a[i].ten)){
                    if(ok == 1){
                        System.out.println("Danh sach cho giang vien " + a[i].ten +":");
                        ok++;
                    }
                    System.out.println(a[i]);
                }   
            }
        }
    }
}
