import java.util.Scanner;

public class J02020_LietKeToHop_1 {
    static int n;
    static int k;
    static int dem;
    static int [] a = new int[1000];
    static void in(){
        for(int i=1;i<=k;i++){
            System.out.print(a[i] );
        }
        dem++;
        System.out.print(" ");
    }
    static void Try(int i){
        for(int j=a[i-1] + 1;j<=n-k+i;j++){
            a[i]=j;
            if(i == k){
                in();
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        dem = 0;
        Try(1);
        System.out.println();
        sc.close();
        System.out.printf("Tong cong co %d to hop", dem);
    }
}
