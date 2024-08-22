import java.util.Scanner;

public class J03006_SoDep_1 {
    static int ThuanNghich(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(r) != s.charAt(l)){
                return 0;
            }
            l++;
            r--;
        }
        return 1;
    }
    static int SoChan(String s){
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)) % 2 == 1 ){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            sc.nextLine();
            while(t-- > 0){
                String s =sc.nextLine();
                if(ThuanNghich(s) == 1 && SoChan(s) == 1){
                    System.out.println("YES");
                }
                else System.out.println("NO");
                
            }
            sc.close();
    }
}
