import java.util.Scanner;

public class J01003_GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a == 0 && b==0){
            System.out.println("VSN");
        }
        else if(a == 0 && b != 0){
            System.out.println("VN");
        }
        else {
            float kq=0;
            kq=-b/a;
            System.out.printf("%.2f",kq);
        }
        sc.close();
    }
}
