import java.util.Scanner;

public class J03004_ChuanHoaHoTen_1 {

    static String ChuanHoa(String s){
        s = s.toLowerCase().trim();
        String [] arr = s.split("\\s+");
        String kq = "";
        for(int i=0;i<arr.length;i++){
            kq += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
            kq += " ";
        }
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
