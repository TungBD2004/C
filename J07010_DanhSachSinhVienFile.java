import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07010_DanhSachSinhVienFile {
    static class SinhVien{
        private String name,lop,dateOfBirth;
        private double GPA;
        private int id;
        public SinhVien() {
        }
        public SinhVien(int id,String name, String lop, String dateOfBirth, double gPA) {
            this.name = name;
            this.lop = lop;
            this.dateOfBirth = dateOfBirth;
            GPA = gPA;
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getLop() {
            return lop;
        }
        public void setLop(String lop) {
            this.lop = lop;
        }
        public String getDateOfBirth() {
            return dateOfBirth;
        }
        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
        public double getGPA() {
            return GPA;
        }
        public void setGPA(double gPA) {
            GPA = gPA;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void in(){
            System.out.printf("B20DCCN%03d ",getId());
            String [] ss = dateOfBirth.split("/");
            String kq = "";
            for(int i=0;i<ss.length;i++){
                if(ss[i].length() < 2){
                    kq+="0";
                }
                kq+=ss[i];
                if(i!=2){
                    kq+="/";
                }
            }
            dateOfBirth=kq;
            System.out.print(name + " " +lop + " " + dateOfBirth +" ");
            System.out.printf("%.2f",GPA);
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien> a = new ArrayList<>();
        for(int i=0;i<t;i++){
            a.add(new SinhVien(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        for(SinhVien i :a){
            i.in();
        }
        sc.close();
    }
}