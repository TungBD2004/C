import java.util.*;
import java.text.*;
import java.io.*;

public class J07084_ThoiGianOnline{
    static class SinhVien{
        
        private String ten,batDau,ketThuc;
        private long time;
        private Date end,begin;
        public SinhVien(String ten, String batDau, String ketThuc) {
            this.ten = ten;
            this.batDau = batDau;
            this.ketThuc = ketThuc;
        }
        public void getTime() throws ParseException{
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date begin = date.parse(batDau);
            Date end = date.parse(ketThuc);
            this.time = (end.getTime() - begin.getTime())/(1000 * 60);
        }
           
    }


    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t= Integer.parseInt(sc.nextLine());
        SinhVien [] a = new SinhVien[t];
        for(int i = 0 ; i<t ;i++){
            a[i] = (new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            a[i].getTime();
        }
        Arrays.sort(a , new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.time == o2.time){
                    return o1.ten.compareTo(o2.ten);
                }
                else return Long.compare(o2.time, o1.time)  ;
            }
            
        });
        for(SinhVien i : a){
            System.out.println(i.ten + " " + i.time);
        }
        sc.close();
    }
} 