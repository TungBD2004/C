import java.util.*;
import java.io.*;
public class J07015_SoNguyenToTrongFileNhiPhan {
    static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        int sqr = (int) Math.sqrt(n);
        for (int i = 5; i <= sqr; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
    public static void main(String[] args) throws Exception, FileNotFoundException{
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) inp.readObject();
        int[] f = new int[10005];
        for (int i : a)
            if (isPrime(i))
                ++f[i];
        for (int i = 2; i <= 10000; ++i)
            if (f[i] > 0)
                System.out.println(i + " " + f[i]);
    }
}
