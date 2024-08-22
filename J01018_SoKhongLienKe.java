import java.util.Scanner;

public class J01018_SoKhongLienKe {
    static int solve(String s)
    {
        for(int i = 1; i < s.length(); ++i)
            if(Math.abs((s.charAt(i) - '0') - (s.charAt(i - 1) - '0')) != 2)
                return 0;
        return 1;
    }
    static long Tong(String s){
        long tong=0;
        for(int i=0;i<s.length();i++){
            tong += s.charAt(i)-'0';
        }
        return tong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            if(Tong(s) % 10 == 0 && solve(s) == 1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}
