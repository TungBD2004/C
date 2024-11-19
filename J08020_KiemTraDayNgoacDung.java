import java.util.Scanner;
import java.util.*;
public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();   
        while(t-->0){
            int ok = 1;
            String s =sc.next();
            Stack<Character> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    st.push(s.charAt(i));
                }
                else {
                    if(s.charAt(i) == ')'){
                        if(!st.empty() && st.peek() == '('){
                            st.pop();
                        }
                        else {
                            ok=0;
                            break;
                        }
                    }
                    if(s.charAt(i) == ']'){
                        if(!st.empty() && st.peek() == '['){
                            st.pop();
                        }
                        else {
                            ok=0;
                            break;
                        }
                    }
                    if(s.charAt(i) == '}'){
                        if(!st.empty() && st.peek() == '{'){
                            st.pop();
                        }
                        else {
                            ok=0;
                            break;
                        }
                    }
                }
                
            }
            if(ok == 1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}
