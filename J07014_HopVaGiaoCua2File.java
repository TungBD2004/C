import java.util.*;
import java.io.*;
public class J07014_HopVaGiaoCua2File {
    public static void main(String[] args) {
        Set<String> se = new HashSet<>();
        Set<String> se2 = new HashSet<>();
        Scanner sc1 = new Scanner("DATA1.in");
        while (sc1.hasNextLine()) {
            String k = sc1.nextLine();
            se.add(k);  
            se2.add(k);
        }
        sc1.close();
        String s = "";
        Scanner sc2= new Scanner("DATA2.in");
        while (sc2.hasNextLine()) {
            String g = sc2.nextLine();
            se.add(g);
            if(se2.contains(g)){
                s+=g;
            }
        }
        for(String i : se){
            System.out.print(i+" ");
        }
        System.out.println(s);
    }
}
