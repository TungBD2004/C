import java.util.*;
import static java.lang.Math.*;
public class J04008_ChuViTamGiac {
    public static boolean check(Point a, Point b,Point c){
        double canh1 = a.distance(b);
        double canh2 = a.distance(c);
        double canh3 = b.distance(c);
        if(canh1 + canh2 <= canh3){
            return false;
        }
        else if(canh1 + canh3 <= canh2){
            return false;
        }
        else if (canh2 + canh3 <= canh1){
            return false;
        }
        else
        return true;
    }
    static class Point{
        private double x;
        private double y;
        public Point(){

        }
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }
        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }
        public double distance(Point p){
            return sqrt(pow(this.x-p.x, 2)+ pow(this.y-p.y, 2));
        }
        public double distance(Point a,Point b){
            return a.distance(b);
        }
        public String toString(){
            return "(+" + this.x + "," + this.y + ")";
        }
        public double ChuVi(Point a, Point b,Point c){
            return a.distance(b) + a.distance(c) + b.distance(c);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            Point a = new Point();
            Point b= new Point();
            Point c = new Point();
            Point d = new Point();
            a.setX(sc.nextDouble());
            a.setY(sc.nextDouble());
            b.setX(sc.nextDouble());
            b.setY(sc.nextDouble());
            c.setX(sc.nextDouble());
            c.setY(sc.nextDouble());
            if(check(a,b,c) == true){
                System.out.printf("%.3f",d.ChuVi(a, b, c));
                System.out.println();
            }
            else {
                System.out.println("INVALID");
            }
        }
        
        sc.close();
    }
}
