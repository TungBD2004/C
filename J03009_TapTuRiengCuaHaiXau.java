import java.util.*;

public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s1 = sc.nextLine();
            String s2= sc.nextLine();
            String [] a1= s1.split("\\s+");
            String [] a2= s2.split("\\s+");
            Set<String> m = new HashSet<>();
            Set<String> n = new HashSet<>();
            Collections.addAll(m,a1);
            Collections.addAll(n,a2);
            for(String i : m){
                if(!n.contains(i)){
                    System.out.print(i+" ");
                }
            } 
            System.out.println();
        }
        sc.close();
    }
}
