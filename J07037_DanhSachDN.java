import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07037_DanhSachDN {
    static class DoanhNghiep{
        private String id,name;
        private int maxStudent;
        public DoanhNghiep() {
        }
        public DoanhNghiep(String id, String name, int maxStudent) {
            this.id = id;
            this.name = name;
            this.maxStudent = maxStudent;
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
        public int getMaxStudent() {
            return maxStudent;
        }
        public void setMaxStudent(int maxStudent) {
            this.maxStudent = maxStudent;
        }
        public void in(){
            System.out.println(id + " " + name + " " + maxStudent);
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while( t--  > 0){
            a.add(new DoanhNghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a,new Comparator<DoanhNghiep>() {

            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                return o1.getId().compareTo(o2.getId());
                
            }
            
        });
        for(DoanhNghiep i : a){
            i.in();
        }
        sc.close();
    }
}
