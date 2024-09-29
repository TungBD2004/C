import java.util.Scanner;


public class J01005_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            double n=sc.nextDouble();
            double h=sc.nextDouble();
           
            for(int i=1;i<n;i++){
                Double kq = Math.sqrt((i*h*h)/n);
                System.out.printf("%.6f ",kq);
            }
            System.out.println();
        }
        sc.close();
    }
}
