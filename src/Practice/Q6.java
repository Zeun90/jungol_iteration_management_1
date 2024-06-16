package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기\n작업할 번호를 선택하세요. ");
            int input = Integer.parseInt(br.readLine());

            switch (input) {
                case 1:
                    System.out.println("\n입력하기를 선택하였습니다.\n");
                    break;
                case 2:
                    System.out.println("\n출력하기를 선택하였습니다.\n");
                    break;
                case 3:
                    System.out.println("\n삭제하기를 선택하였습니다.\n");
                    break;
                case 4:
                    System.out.println("\n끝내기를 선택하였습니다.\n");
                    break;
                default:
                    System.out.println("\n잘못 입력하였습니다.\n");
            }

            if (input == 4) {
                break;
            }
        }
    }
}