import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J08015_CapSoCoTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            HashMap<Long,Integer> MAP = new HashMap<>();
            long [] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                if(MAP.containsKey(a[i])){
                    int x = MAP.get(a[i]);
                    MAP.put(a[i], x+1);
                }
                else MAP.put(a[i], 1);
            }
            long kq = 0;
            for(int i=0;i<n;i++){
                if(k - a[i] !=a[i]){
                    if(MAP.containsKey(k-a[i])){
                        kq += MAP.get(k-a[i]);
                    }
                }
                else{
                    kq += MAP.get(a[i])-1;
                }  
            }
            System.out.println(kq/2);
        }
        sc.close();
    }
}
