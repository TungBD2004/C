import java.util.Scanner;

public class J02104_DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [][] a = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(a[i][j] == 1 && i<j){
                    System.out.printf("(%d,%d)",i,j);
                    System.out.println();
                }   
            }
        }
        sc.close();
    }
}
