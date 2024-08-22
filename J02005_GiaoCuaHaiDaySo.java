import java.util.Scanner;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[] = new int[10005];
        int b[] = new int[10005];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            a[x]++;
        }
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            b[x]++;
        }
        for(int i=0;i<10000;i++){
            if(a[i] >0 && b[i] >0){
                System.out.print(i+ " ");
            }
        }
        sc.close();
    }
    
}
