
import java.util.Scanner;

public class J03005_ChuanHoaHoTen_2 {

    static String ChuanHoa(String s){
        s = s.toLowerCase().trim();
        String [] arr = s.split("\\s+");
        String kq = "";
        for(int i=1;i<arr.length;i++){
            kq += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
            if(i != arr.length-1){
                kq += " ";
            }
            
            
        }
        kq+=", ";
        kq += arr[0].toUpperCase();
        return kq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(ChuanHoa(s));
        }
        sc.close();
    }
}
