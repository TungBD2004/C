import java.util.*;
public class J08024_So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            Queue<Integer> Q = new LinkedList<>();
            Q.add(9);
            while(true){
                int tam = Q.peek();
                Q.remove();
                if (tam % n == 0) {
                    System.out.println(tam);
                    break;
                }
                Q.add(tam*10);
                Q.add(tam*10+9);
            }
        }
        
        sc.close();
    }
}
