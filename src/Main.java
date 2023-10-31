// Shift을(를) 두 번 눌러 전체 검색 대화상자를 열고 'show whitespaces'를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 캐럿을 강조 표시된 텍스트에 놓고 Alt+Enter을(를) 누르면
        //FileReader fin = null;
        //FileInputStream fin = null;
        // InputStreamReader in = null;
        // String name = "";
          /* try {
            // fin = new FileReader("C:\\Temp\\Han.txt");
            fin = new FileInputStream("C:\\Temp\\Han.txt");
            in = new InputStreamReader(fin, "MS949");
            int c;
            while((c = fin.read()) != -1 /* && (char)c == '\n' 첫번째 엔터를 입력하기 전까지 ) {
                System.out.print((char)c);
                // name += (char)c;
            }
            fin.close();
            in.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

        // System.out.println();
        // System.out.println(name);
        */
        Scanner s = new Scanner(System.in);
        FileWriter fout = null;
        int score = 999;
        try {
            fout = new FileWriter("C:\\Temp\\Han.txt");
            while(true) {
                String line = s.nextLine();
                if(line.length() == 0) {
                    break;
                }
                fout.write(line, 0, line.length());
                fout.write("\r\n", 0, 2);
            }
            // fout.write(score);
            // int -> String
            String str;
            str = score + "";
            fout.write(str, 0, str.length());
            fout.write("\r\n", 0, 2);
            fout.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
