import java.text.*;
import java.util.*;
import java.io.*;
public class J07059_DanhSachCaThi {
    static class CaThi{
        private int ma;
        private String date,time;
        private String id;
        public CaThi(int ma,String date, String time, String id) {
            this.ma = ma;
            this.date = date;
            this.time = time;
            this.id = id;
        }
        public int getYear(){
            String s = this.date;
            return 1000*(s.charAt(6) - '0') + 100*(s.charAt(7) - '0') + 10*(s.charAt(8)-'0') + s.charAt(9);
        }
        public int getMonth(){
            String s = this.date;
            return 10*(s.charAt(3) - '0') + s.charAt(2) - '0';
        }
        public int getDay(){
            String s = this.date;
            return 10*(s.charAt(0) - '0') + s.charAt(1)-'0';
        }
        public int getHour(){
            String s = this.time;
            return 10 * (s.charAt(0) - '0') + s.charAt(1) - '0';
        }
        public int getMinute(){
            String s = this.time;
            return 10 * (s.charAt(3) - '0') + s.charAt(4) - '0';
        }
        public void in(){
            System.out.printf("C%03d ",ma);
            System.out.println(date + " " + time + " " + id);
        }
        
    }
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        CaThi [] a = new CaThi[t];
        for(int i=0;i<t;i++){
            a[i] = new CaThi(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a , new Comparator<CaThi>() {

            @Override
            public int compare(CaThi o1, CaThi o2) {
                if(o1.getYear() != o2.getYear()){
                    return (int) (o1.getYear() - o2.getYear());
                }
                if(o1.getMonth() != o2.getMonth()){
                    return (int) (o1.getMonth() - o2.getMonth());
                }
                if(o1.getDay() != o2.getDay()){
                    return (int) (o1.getDay() - o2.getDay());
                }
                if(o1.getHour() != o2.getHour()){
                    return (int) (o1.getHour() - o2.getHour());
                }
                if(o1.getMinute() != o2.getMinute()){
                    return (int) (o1.getMinute() - o2.getMinute());
                }
                return o1.ma-o2.ma;
            }
            
        });
        for(CaThi i : a){
            i.in();
        }
        sc.close();
    }
}
