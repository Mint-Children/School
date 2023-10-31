import java.io.*;
import java.util.*;

public class _23_10_31_2 {

    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1 , 24};
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Temp\\Han_2.txt");
            for(int i = 0; i < b.length; i++) {
                fout.write(b[i]);
            }
            fout.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
        byte b2[] = new byte[6];
        try {
            FileInputStream fin = new FileInputStream("C:\\Temp\\Han_2.txt");
            int n = 0, c;
            while((c = fin.read()) != -1) {
                b2[n] = (byte)c;
                n++;
            }
            for (int i = 0; i < b2.length; i++) {
                b2[i] += 10;
                System.out.print(b2[i] + " ");
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
