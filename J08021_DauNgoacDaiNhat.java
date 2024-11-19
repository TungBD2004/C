import java.util.*;

public class J08021_DauNgoacDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s= sc.next();
            Stack<Integer> st= new Stack<>();
            st.push(-1);
            int MAX=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '('){
                    st.push(i);
                }
                else{
                    st.pop();
                    if(!st.empty()){
                        MAX = Math.max(MAX, i-st.peek());
                    }
                    else {
                        st.push(i);
                    }
                }
            }
            System.out.println(MAX);
        }
        sc.close();
    }
}
