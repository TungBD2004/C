import java.util.*;
import static java.lang.Math.*;
public class J04001_KhaiBaoLopPoint {
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
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            Point a = new Point();
            Point b = new Point();
            a.setX(sc.nextDouble());
            a.setY(sc.nextDouble());
            b.setX(sc.nextDouble());
            b.setY(sc.nextDouble());
            System.out.printf("%.4f",a.distance(b));
            System.out.println();
        }
        sc.close();
    }
}
