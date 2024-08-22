import java.util.Scanner;

public class J03024_SoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            String s = sc.next();
            int chan = 0;
            int le = 0;
            int ok = 1;
            if(s.charAt(0) == '0'){
                ok = 0;
            }
            for(int i=0;i<s.length();i++){
                if(!Character.isDigit(s.charAt(i))){
                    ok=0;
                    break;
                }
                if((s.charAt(i) - '0') % 2 == 0 ){
                    chan++;
                }
                else if((s.charAt(i) - '0') % 2 == 1){
                    le++;
                }
            }
            if(ok == 1){
                if((s.length()%2 == 0 && chan > le) || (s.length()%2 == 1 && chan < le)) 
                    System.out.println("YES");
                else {
                    System.out.println("NO");
                }   
            }
            else {
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}
