import java.util.Scanner;

public class J02022_SoXaCach {
    static int n;
    static int [] a = new int[1000];
    static int [] ok = new int[1000];
    static void khoitao(){
        for(int i=1;i<=n;i++){
            ok[i] = 0;
        }
    }
    static void in(){
        int check = 1;
        for(int i=2;i<=n;i++){
            if(Math.abs(a[i] - a[i-1]) == 1){
                check = 0;
                break;
            }
        }
        if(check == 1 ){
            for(int i=1;i<=n;i++){
                System.out.print(a[i]);
            }
            System.out.println();
        }
        
    }
    static void Try(int i){
        for(int j=1;j<=n;j++){
            if(ok[j] == 0){
                a[i]= j;
                ok[j] = 1;
                if(i == n){
                    in();
                }
                else Try(i+1);
                ok[j] = 0;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            n=sc.nextInt();
            khoitao();
            Try(1);    
        }
        sc.close();
    }
}
