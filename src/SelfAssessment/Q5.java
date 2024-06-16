package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int divisorNum = 3;

        while (true) {
            int input = Integer.parseInt(br.readLine());

            if (input == -1) {
                break;
            } else if (input % divisorNum == 0) {
                System.out.println(input / divisorNum);
            }
        }
    }
}