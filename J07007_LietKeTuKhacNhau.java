import java.io.File;
import java.util.*;

public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws Exception{
        File f = new File("VANBAN.in");
        Scanner sc = new Scanner(f);
        TreeSet<String> se = new TreeSet<>();
        while(sc.hasNext()){
            se.add(sc.next().toLowerCase());
        }
        for (String i : se) {   
            System.out.println(i);  
        }
        sc.close();
    }
}
