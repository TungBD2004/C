import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022_LoaiBoSoNguyen {
    static boolean check(String s){
        if(s.length() > 9){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;

    }
    static long chuyen(String s){
        long kq=0;
        for(int i=0;i<s.length();i++){
            kq+= kq*10 + s.charAt(i)-'0';
        }
        return kq;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s) == false){
                a.add(s);
            }
            else{
                long kq = chuyen(s);
                if(kq > 2147483647){
                    a.add(s);
                }
            }
        }
        Collections.sort(a);
        for(String i : a){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
