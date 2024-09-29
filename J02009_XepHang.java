import java.util.*;
public class J02009_XepHang {
    public static class Gio{
        private int gio,baoLau;
        public Gio(int gio, int baoLau) {
            this.gio = gio;
            this.baoLau = baoLau;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Gio [] a = new Gio[n];
        for(int i=0;i<n;i++){
            a[i] = new Gio(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a, new Comparator<Gio>() {
            @Override
            public int compare(Gio o1, Gio o2) {
                if(o1.gio != o2.gio){
                    return Integer.compare(o1.gio, o2.gio);
                }
                else return Integer.compare(o1.baoLau,o2.baoLau);
            }     
        });
        
        int kq = 0;
        for(int i=0;i<n;i++){
            if(kq <= a[i].gio ){
                kq = a[i].gio+ a[i].baoLau;
            }
            else {
                kq+=a[i].baoLau;
            }
        }
        System.out.println(kq);
    }
}
