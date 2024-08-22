import java.util.Scanner;

public class J02011_SapXepChon {
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
            int MIN = a[i];
            int vitri=i;
            for(int j=i+1;j<n;j++){
                if(a[j] < MIN){
                    vitri = j;
                    MIN = a[j];
                }
            }
            int tam = a[i];
            a[i]=a[vitri];
            a[vitri]=tam;
            for(int j=0;j<n;j++){
                System.out.print(a[j]+ " ");
            }
            System.out.println();
        }



        sc.close();
    }
}
