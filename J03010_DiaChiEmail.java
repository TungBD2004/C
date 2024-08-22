import java.util.*;

public class J03010_DiaChiEmail {
    public static Map<String, Integer> mp = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.toLowerCase().trim();
            String [] a = s.split("\\s+");
            String kq = "";
            kq += a[a.length-1];
            for(int i=0;i<a.length-1;i++){
                kq+= a[i].charAt(0);
            }
            if (mp.containsKey(kq)) {
                mp.put(kq, mp.get(kq) + 1);
            } else {   
                mp.put(kq,1);
            }
            int stt = mp.get(kq);
            if(stt > 1){
                kq += String.valueOf(stt);
            }
            kq += "@ptit.edu.vn";
            System.out.println(kq);
        }
        sc.close();
    }
}
