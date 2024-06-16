package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int num = 1;
        int result = 0;

        if (1 <= input && input <= 100) {
            while (num <= input) {
                result += num;
                num++;
            }
            System.out.println(result);
        }
    }
}