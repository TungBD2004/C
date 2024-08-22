import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02012_SapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a = new int[100];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(a[i]);
            Collections.sort(res);
            System.out.printf("Buoc %d: ", i);
            for (int val : res) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
