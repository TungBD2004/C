import java.io.File;
import java.util.Scanner;

public class J07002_TinhTong {
    static boolean check(String s){
        if(s.length()>9){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) == false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        long tong = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                int s1 = Integer.parseInt(s);   
                if(s1<=2147483647) {
                    tong+=s1;
                }
            }
        }
        System.out.println(tong);
        sc.close();
    }
}
