import java.util.Scanner;

public class J02106_MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int dem = 0;
        int [][] a = new int[n+1][4];
        for(int i=1;i<=n;i++){
            int h1 = 0;
            int h0 = 0;
            for(int j=1;j<=3;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j] == 1){
                    h1++;
                }
                else h0++;
            }
            if(h1>h0){
                dem++;
            }
        }
        System.out.println(dem);
        sc.close();
    }
}
