import java.util.Scanner;
import java.io.File;
public class J07004_SoKhacNhauTrongFile_1 {
    public static void main(String[] args) throws Exception{
        File f = new File("DATA.IN");
        Scanner sc = new Scanner(f);   
        int [] a = new int[1005];
        while (sc.hasNextInt()) {
            ++a[sc.nextInt()];
        }
        for(int i=0;i<=1000;i++){
            if(a[i] > 0){
                System.out.println(i +" " +a[i]);
            }
        }
        sc.close();
    }
}
