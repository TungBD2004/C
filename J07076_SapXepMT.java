import java.io.File;
import java.util.Scanner;

public class J07076_SapXepMT {
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());
            int [][] a = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j] =sc.nextInt();
                }
            }
            for(int l=k;l<n;l++){
                for(int h=k+1;h<n;h++){
                    if(a[l][k] <= a[h][k]){
                        int tam = a[l][k];
                        a[l][k] = a[h][k];
                        a[h][k] = tam;
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(a[i][j] +" ");
                }
                System.out.println("");
            }
        }
        


        sc.close();
    }
}