import java.util.Scanner;

public class J03025_XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            int dem =0;
            int l=0;
            int r=s.length()-1;
            while(l<r){
                if(s.charAt(l) != s.charAt(r)){
                    dem++;
                }
                l++;
                r--;
            }
            if(dem == 1){
                System.out.println("YES");
            }
            else if(dem == 0 && s.length() % 2 == 1) System.out.println("YES");
            else {
                System.out.println("NO");
            }
        }
        sc.close();

    }
}
