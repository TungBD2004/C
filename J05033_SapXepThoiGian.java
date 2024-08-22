import java.util.*;


public class J05033_SapXepThoiGian {
    static class Time{
        private int gio;
        private int phut;
        private int giay;
        public Time() {
        }
        public Time(int gio, int phut, int giay) {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }
        public int getGio() {
            return gio; 
        }
        public void setGio(int gio) {
            this.gio = gio;
        }
        public int getPhut() {
            return phut;
        }
        public void setPhut(int phut) {
            this.phut = phut;
        }
        public int getGiay() {
            return giay;
        }
        public void setGiay(int giay) {
            this.giay = giay;
        }
        public void in() {
            System.out.print(gio + " " + phut +" " + giay);
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Time> a = new ArrayList<>();
        int t= sc.nextInt();
        while(t-- > 0){
            a.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a,new Comparator<Time>() {
            @Override       
            public int compare(Time o1, Time o2) {
                if(o1.getGio() == o2.getGio()){
                    if(o1.getPhut() == o2.getPhut()){
                        return o1.getGiay() > o2.getGiay() ?1:-1;
                    }
                    else {
                        return o1.getPhut() > o2.getPhut() ?1:-1;
                    }
                }
                
                return o1.getGio()>o2.getGio() ?1:-1;
            }
       
        });
        for(Time x: a){
            x.in();
        }
        sc.close();
    }
}
