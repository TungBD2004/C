import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07048_DanhSachSP_2 {
    static class SanPham{
        private String id,name;
        private int cost,time;
        public SanPham() {
        }
        public SanPham(String id, String name, int cost, int time) {
            this.id = id;
            this.name = name;
            this.cost = cost;
            this.time = time;
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
        public int getCost() {
            return cost;
        }
        public void setCost(int cost) {
            this.cost = cost;
        }
        public int getTime() {
            return time;
        }
        public void setTime(int time) {
            this.time = time;
        }
        public void in(){
        System.out.println(id +" " + name +" " + cost + " " + time);
        }
    }



    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            a.add(new SanPham(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a,new Comparator<SanPham>() {

            @Override
            public int compare(SanPham o1, SanPham o2) {
                if(o1.getCost() == o2.getCost()){
                    return o1.getId().compareTo(o2.getId());
                }
                return o2.getCost() - o1.getCost();
            }
            
        });
        for(SanPham i:a){
            i.in();
        }
        sc.close();
    }
}
