import java.io.File;
import java.util.Scanner;

public class J07001_DocFileVB {
    public static void main(String[] args) throws Exception {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
    
}