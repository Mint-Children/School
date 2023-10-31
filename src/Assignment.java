import java.io.*;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        try {
            String filename = "c:\\Temp\\Assignment.txt";
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            String name = fileReader.readLine();
            String scoreStr = fileReader.readLine();
            int score = Integer.parseInt(scoreStr);
            fileReader.close();

            Scanner scanner = new Scanner(System.in);
            int NowScore = score;

            System.out.println(name + " 님 안녕하세요.");
            System.out.println("현재 점수 : " + NowScore + "점 입니다.");

            while (true) {
                System.out.print("문자열을 입력하고 Enter를 누르세요 (끝내려면 엔터 입력): ");
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    System.out.println("----- 종료합니다. 다음과 같이 저장 됩니다. -----");
                    System.out.println("현재 점수는 : " + NowScore + " 점 입니다.");
                    break;
                }

                int increment = input.length();
                NowScore += increment;
            }

            scanner.close();

            // 파일에 새로운 점수를 저장
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename));
            fileWriter.write(name + "\n");
            fileWriter.write(Integer.toString(NowScore));
            fileWriter.close();

            System.out.println("최종 점수가 파일에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류!");
        }
    }
}
