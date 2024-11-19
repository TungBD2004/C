import java.util.*;
public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            Queue<String> q= new LinkedList<>();
            q.add("6");
            q.add("8");
            int n = sc.nextInt();
            ArrayList<String> a = new ArrayList<>();
            int i = 0;
            while(true){
                String tam = q.poll();
                if(tam.length() > n){
                    break;
                }
                a.add(tam);
                q.add(tam+"6");
                q.add(tam+"8");    
            }
            System.out.println(a.size());
            for(int j=a.size()-1;j>=0;j--){
                System.out.print(a.get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
