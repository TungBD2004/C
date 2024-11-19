import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        String kq = s;
        while(true){
            int dai = kq.length();
            dai/=2;
            String s1="";
            String s2="";
            int dai2=0;
            for(int i=0;i<dai;i++){
                s1+=kq.charAt(i);
                dai2=i;
            }
            for(int i=dai2+1;i<kq.length();i++){
                s2+=kq.charAt(i);
            }
            BigInteger a1 = new BigInteger(s1);
            BigInteger a2 = new BigInteger(s2);
            BigInteger tong = a1.add(a2);
            System.out.println(tong);
            kq = tong.toString();
            if(kq.length() == 1){
                break;
            }
        }
        sc.close();
    }
}