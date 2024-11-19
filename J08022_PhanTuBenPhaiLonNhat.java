import java.util.*;

public class J08022_PhanTuBenPhaiLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n =sc.nextInt();
            int [] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            ArrayList<Integer> b = new ArrayList<>();
            for(int i = n-1;i>=0;i--){
                while(!st.empty() && st.peek() <= a[i]){
                    st.pop();
                }
                if(st.empty()){
                    b.add(-1);
                }
                else{
                    b.add(st.peek());
                }
                st.push(a[i]);
            }
            for(int i=n-1;i>=0;i--){
                System.out.print(b.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
