import java.util.Scanner;

public class J02010_SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a = new int[100];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int b=1;
        for(int i=0;i<n-1;i++){
            System.out.print("Buoc " + b++ + ": ");
            for(int j=i +1;j<n;j++){
                if(a[j] <  a[i]){
                    int tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
            for(int j=0;j<n;j++){
                System.out.print(a[j]+ " ");
            }
            System.out.println();
            sc.close();
        }
    }
}
