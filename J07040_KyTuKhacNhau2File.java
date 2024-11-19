import java.io.*;
import java.util.*;


public class J07040_KyTuKhacNhau2File {
    public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException, IOException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = new ArrayList<>(); 
        sc1.readObject();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> s1 = new TreeSet<>();
        Set<String> s2 = new TreeSet<>();
        for(String i: a){
            i.trim().toLowerCase();
            String [] kq = i.split("\\s+");
            for(String j: kq){
                s1.add(j);
            }    
        }
        ArrayList<String>res = new ArrayList<>();
        while(sc.hasNext()){
            String s=sc.nextLine();
            s = s.trim().toLowerCase();
            String [] kq = s.split("\\s+");
            for(String i:kq){
                res.add(i);
                if(s1.contains(i)){
                    s2.add(i);
                }
            }
        }
        for(String i:res){
            if(s2.contains(i)){
                System.out.println(i);
                s2.remove(i);
            }
        }
        sc.close();
        sc1.close();
    }
}
