import java.util.Scanner;
import java.util.ArrayList;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        
        while(true){
            int ok=0;
            for(int i=1;i<a.size();i++){
                if((a.get(i) + a.get(i-1)) % 2 == 0 ){
                    ok=1;
                    a.remove(i);
                    a.remove(i-1);
                    i-=1;
                }
            }
            if(ok == 0){
                break;
            }
        }
        System.out.println(a.size());
        sc.close();
    }
}
