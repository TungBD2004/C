import java.util.Scanner;
import java.util.Arrays;
public class J02013_SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a = new int[n];
        int [] c = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            c[i] = a[i];
        } 
        Arrays.sort(c);
    
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print("Buoc "+ b++ +": ");
            for(int j=0;j<n-1;j++){
                if(a[j] > a[j+1]){
                    int tam=a[j];
                    a[j] = a[j+1];
                    a[j+1]=tam;
                }
            }
            int dem=0;
            for(int j=0;j<n;j++){
                System.out.print(a[j] +" ");
                if(a[j] == c[j]){
                    dem++;
                }
            }
            if(dem == n){
                break;
            }
            
            System.out.println();
        }
        sc.close();
    }
}
