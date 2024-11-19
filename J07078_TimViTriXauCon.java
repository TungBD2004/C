import java.util.*;
import java.io.*;
public class J07078_TimViTriXauCon {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("STRING.in"));
        int t =Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int n1 = s1.length();
            int n2 = s2.length();
            for (int i=0;i<n1-n2+1;i++){
                int j =0;
                while (j<n2 && s1.charAt(i+j) == s2.charAt(j)) j++;
                if(j == n2){
                    System.out.print(i+1+" ");
                }
            }
            System.out.println();
        }    
    }
}
