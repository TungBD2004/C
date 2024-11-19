import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07072_ChuanHoaVaSX {
    static String ChuanHoa(String s){
        s= s.toLowerCase().trim();
        String [] a =s.split("\\s+");
        String kq ="";
        for(int i=0;i<a.length;i++){
            kq += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
            kq+= " ";
        }
        return kq;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            a.add(ChuanHoa(s));
        }
        Collections.sort(a , new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String [] s1 = o1.split("\\s+");
                String [] s2 = o2.split("\\s+");
                if(s1[s1.length-1].compareTo(s2[s2.length-1]) != 0) return s1[s1.length-1].compareTo(s2[s2.length-1]);
                return o1.compareTo(o2);
            }
            
        });
        for(String i : a){
            System.out.println(i);
        }
        sc.close();
    }
}
