import java.util.*;
public class J0237_DayUuThe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
            String s =sc.nextLine();
            s += " ";
            int le=0;
            int chan =0;
            int dem = 0 ;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) != ' ' && s.charAt(i+1) ==' '){
                    if((s.charAt(i)) % 2 == 0){
                        chan++;     
                    }
                    else {
                        le++;
                    }
                    dem++;
                }
            }
            if((chan > le && dem%2==0) || (chan < le && dem % 2 ==1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}