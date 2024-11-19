import java.util.*;
import java.io.*;
public class J07081_SXDanhSachSV {
    static class SV{
        private String ma,ten,sdt,email;

        public SV() {
        }
        public SV(String ma, String ten, String sdt, String email) {
            this.ma = ma;
            this.ten = ten;
            this.sdt = sdt;
            this.email = email;
        }
        public String getTen(){
            String [] kq = ten.split("\\s+");
            return kq[kq.length-1];
        }
        public String getHo(){
            String [] kq = ten.split("\\s+");
            return kq[0];
        }
        public String getDem(){
            String [] kq = ten.split("\\s+");
            String res = "";
            for(int i=1;i<kq.length-1;i++){
                res+=kq[i];
            }
            return res;
        }
        public void in(){
            System.out.println(ma+ " " + ten +" "+ sdt + " " + email);
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add( new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a,new Comparator<SV>() {
            @Override
            public int compare(SV a,SV b) {
                if (!a.getTen().equals(b.getTen())) {
                    return a.getTen().compareTo(b.getTen());
                } else if (!a.getHo().equals(b.getHo())) {
                    return a.getHo().compareTo(b.getHo());
                } else if (!a.getDem().equals(b.getDem())) {
                    return a.getDem().compareTo(b.getDem());
                }
                return a.ma.compareTo(b.ma);       
            }        
        });
        for(SV i : a){
            i.in();
        }
        sc.close();
    }
}
