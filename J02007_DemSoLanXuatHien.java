import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int h=1;
        while(t-- >0){
            int n=sc.nextInt();
            int a[] = new int[n];   
            int b[] = new int[100005];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                b[a[i]]++;
            }
            System.out.println("Test "+ h ++ + ":");
            for(int i=0;i<n;i++){
                if(b[a[i]] > 0){
                    System.out.println(a[i] + " xuat hien " + b[a[i]] + " lan");
                    b[a[i]]=0;
                }
            }
        } 
        sc.close();
    }
}
