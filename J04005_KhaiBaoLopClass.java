import java.util.Scanner;

public class J04005_KhaiBaoLopClass {
    static class SinhVien{
        private String name;
        private String dateOfBirth;
        private double mark1;
        private double mark2;
        private double mark3;
        public SinhVien() {
        }
        public SinhVien(String name, String dateOfBirth, double mark1, double mark2, double mark3) {
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDateOfBirth() {
            return dateOfBirth;
        }
        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
        public double getMark1() {
            return mark1;
        }
        public void setMark1(double mark1) {
            this.mark1 = mark1;
        }
        public double getMark2() {
            return mark2;
        }
        public void setMark2(double mark2) {
            this.mark2 = mark2;
        }
        public double getMark3() {
            return mark3;
        }
        public void setMark3(double mark3) {
            this.mark3 = mark3;
        }
        public void in(){
            double totalMark=mark1 + mark2 + mark3; 
            System.out.print(name + " " +dateOfBirth+" ");
            System.out.printf("%.1f",totalMark);;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien();
        a.setName(sc.nextLine());
        a.setDateOfBirth(sc.next());
        a.setMark1(sc.nextDouble());
        a.setMark2(sc.nextDouble());
        a.setMark3(sc.nextDouble());
        a.in();
        sc.close();
    }
}
