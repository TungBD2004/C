import java.util.*;
import java.io.*;;

public class J07073_DangKiGiangDay {
    static class MonHoc {
        private String id,ten;
        private int tinChi;
        private String lyThuyet,thucHanh;
        public MonHoc(String id, String ten, int tinChi, String lyThuyet, String thucHanh) {
            this.id = id;
            this.ten = ten;
            this.tinChi = tinChi;
            this.lyThuyet = lyThuyet;
            this.thucHanh = thucHanh;
        }
        
        public String getThucHanh() {
            return thucHanh;
        }

        @Override
        public String toString() {
            return   id + " " + ten + " " + tinChi + " " + lyThuyet + " "
                    + thucHanh ;
        }
        
        
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        for(int i=0;i<t;i++){
            a.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));

        }
        Collections.sort(a , new Comparator<MonHoc> (){

            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.id.compareTo(o2.id);
            }

        });
        for(MonHoc i : a){
            if(!i.getThucHanh().equals("Truc tiep"))
            System.out.println(i);
        }
        sc.close();
    }
}
