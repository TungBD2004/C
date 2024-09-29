import java.util.Scanner;

public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a=1;
            System.out.print("Test " + a + ": ");
            for(int i=2;i<=n;i++){
                int dem=0;
                while(n%i == 0){
                    dem++;
                    n/=i;
                }
                if(dem>0){
                    System.out.print(i +"("+dem +") " );
                }
            }
            if(n>1){
                System.out.print(n +"(1)");
            }
            System.out.println();
            t--;
            a++;
        }
        sc.close();
    }
}
