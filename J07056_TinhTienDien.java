import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class J07056_TinhTienDien {
    static String ChuanHoa(String s){
        s= s.toLowerCase().trim();
        String [] a =s.split("\\s+");
        String kq ="";
        for(int i=0;i<a.length;i++){
            kq += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
            kq+= " ";
        }
        return kq;
    }
    static class TienDien{
        private String ten;
        private String KV;
        private int ma,soDau,soCuoi;
        public TienDien() {
        }
        public TienDien(int ma,String ten, String KV, int soDau, int soCuoi) {
            this.ten = ten;
            this.KV = KV;
            this.ma = ma;
            this.soDau = soDau;
            this.soCuoi = soCuoi;
        }
        public int getKV(){
            if(KV == "A"){
                return 100;
            }
            else if(KV == "B"){
                return 500;
            }
            else{
                return 200;
            }
        }
        public int getTrongDinhMuc(){
            if(soCuoi - soDau <  getKV() ){
                return 450 * (soCuoi - soDau);
            }
            else {
                return 450 * getKV();
            }
        }
        public int getNgoaiDinhMuc(){
            if(soCuoi - soDau > getKV()){
                return (soCuoi - soDau-getKV())*1000;
            }
            else{
                return 0;
            }
        }
        public double getVAT(){
            return (double) getNgoaiDinhMuc()*0.05;
        }
        public int getTien(){
            return (int) (getTrongDinhMuc() + getNgoaiDinhMuc() +getVAT());
        }
        public void in(){
            System.out.printf("KH%02d ",ma);
            System.out.print(ChuanHoa(ten) +getTrongDinhMuc()+ " " +getNgoaiDinhMuc()+ " ");
            System.out.printf("%.0f ",getVAT());
            System.out.println(getTien());
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TienDien> a = new ArrayList<>();
        for(int i=0;i<t;i++){   
            a.add(new TienDien(i+1,sc.nextLine(),sc.next(),Integer.parseInt(sc.next()),Integer.parseInt(sc.next())));
        }
        Collections.sort(a ,new Comparator<TienDien>() {
            @Override
            public int compare(TienDien o1, TienDien o2) {
                return Integer.compare(o2.getTien(), o1.getTien());
            }
            
        });
        for(TienDien i : a){
            i.in();
        }
        sc.close();

    }   
}
