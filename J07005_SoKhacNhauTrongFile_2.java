import java.io.*;
public class J07005_SoKhacNhauTrongFile_2 {
    public static void main(String[] args) throws IOException{
        DataInputStream da = new DataInputStream(new FileInputStream("DATA.in"));
        int [] f = new int[1005];
        for(int i=0;i<100000;i++){
            int a = da.readInt();
            f[a]++;
        }
        for(int i=0;i<=1000;i++){
            if(f[i]>0){
                System.out.println(i + " " +f[i]);
            }
        }
    }
}
