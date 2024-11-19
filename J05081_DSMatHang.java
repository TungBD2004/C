import java.util.*;

public class J05081_DSMatHang {

    static class MH{
        private String tenMH,dvt;
        private long giaMua,giaBan;
        private int maMH;

        public MH() {
        }

        public MH(int maMH, String tenMH, String dvt, long giaMua, long giaBan) {
            this.maMH = maMH;
            this.tenMH = tenMH;
            this.dvt = dvt;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }

        public int getMaMH() {
            return maMH;
        }

        public void setMaMH(int maMH) {
            this.maMH = maMH;
        }

        public String getTenMH() {
            return tenMH;
        }

        public void setTenMH(String tenMH) {
            this.tenMH = tenMH;
        }

        public String getDvt() {
            return dvt;
        }

        public void setDvt(String dvt) {
            this.dvt = dvt;
        }

        public long getGiaMua() {
            return giaMua;
        }

        public void setGiaMua(long giaMua) {
            this.giaMua = giaMua;
        }

        public long getGiaBan() {
            return giaBan;
        }

        public void setGiaBan(long giaBan) {
            this.giaBan = giaBan;
        }

        public long getLoiNhuan() {
            return giaBan-giaMua;
        }

        public void in(){
            System.out.printf("MH%03d ", maMH);
            System.out.println(tenMH +" " + dvt +" " + giaMua +" " + giaBan +" " +getLoiNhuan());
        }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<MH> a = new ArrayList<>();
        for(int i=0;i<t;i++){
            sc.nextLine();
            a.add(new MH(i+1,sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong()));
        }
        Collections.sort(a,new Comparator<MH>() {
            @Override
            public int compare(MH o1,MH o2) {
                if(o1.getLoiNhuan() == o2.getLoiNhuan()){
                    return o1.maMH > o2.maMH ? 1:-1;
                }
                return o1.getLoiNhuan() < o2.getLoiNhuan() ?1:-1;
            }
            
        });
        for(MH i:a){
            i.in();
        }
        sc.close();
    }
}
