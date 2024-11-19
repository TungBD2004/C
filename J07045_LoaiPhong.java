import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String line, name;

    public String getName() {
        return name;
    }

    public LoaiPhong(String line) {
        this.line = line;
        this.name = line.trim().split("\\s+")[1];
    }
    public int compareTo(LoaiPhong o){
        return this.getName().compareTo(o.getName());
    }
    @Override
    public String toString() {
        return line;
    }
}

public class J07045_LoaiPhong {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
        in.close();
    }
}
