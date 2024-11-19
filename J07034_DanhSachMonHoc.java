import java.io.File;
import java.util.*;

public class J07034_DanhSachMonHoc {
    static class MonHoc{
        private String id,name;
        private int tinChi;
        public MonHoc() {
        }
        public MonHoc(String id, String name, int tinChi) {
            this.id = id;
            this.name = name;
            this.tinChi = tinChi;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getTinChi() {
            return tinChi;
        }
        public void setTinChi(int tinChi) {
            this.tinChi = tinChi;
        }
        public void in(){
            System.out.println(id + " " + name + " "+tinChi);
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        while(t -- > 0){
            a.add(new MonHoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2 ) {
                return o1.getName().compareTo(o2.getName());
            }   
        });
        for(MonHoc i : a){
            i.in();
        }
        sc.close();
    }   
}
