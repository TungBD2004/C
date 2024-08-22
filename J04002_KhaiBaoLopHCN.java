
import java.util.*;
public class J04002_KhaiBaoLopHCN {
    
    static class Rectange{
        private double width;
        private double height;
        private String color;
        public Rectange() {
        }
        public Rectange(double width, double height,String color) {
            this.width = width;
            this.height = height;
            this.color = color;
        }
        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public double getHeight() {
            return height;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public String getColor() {
            String s = color;
            s = s.toLowerCase();
            String kq="";
            kq+=Character.toUpperCase(s.charAt(0));
            kq += s.substring(1);
            return kq;

        }
        public void setColor(String color) {
            this.color = color;
        }
        public double findArea(){
            return width * height;
        }
        public double findPerimeter(){
            return (width+height)*2;
        }
        public boolean check() {
            if(width <= 0 || height <= 0){
                return false;
            }
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange a = new Rectange();
        a.setWidth(sc.nextDouble());
        a.setHeight(sc.nextDouble());
        a.setColor(sc.next());
        if(a.check()){
            System.out.printf("%.0f %.0f %s",a.findPerimeter(),a.findArea(),a.getColor());
        }
        else
        System.out.println("INVALID");
        sc.close();
    }
}
