import java.io.File;
import java.util.Scanner;


public class HELLOFILE {
    public static void main(String[] args) throws Exception {
        File f = new File("Hello.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {  
            System.out.println(sc.nextLine());
        }      
        sc.close();
    }
}
