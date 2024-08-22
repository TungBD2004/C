import java.io.File;
import java.util.Scanner;

public class J07021_ChuanHoaHoTenFile{
    static String ChuanHoa(String s){
        s = s.toLowerCase().trim();
        String [] ss = s.split("\\s+");
        String kq="";
        for(int i=0;i<ss.length;i++){
            kq += Character.toUpperCase(ss[i].charAt(0)) + ss[i].substring(1);
            kq+=" ";
        }
        return kq;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }
            else{
                System.out.println(ChuanHoa(s));
            }
        }
        sc.close();
    }
}
