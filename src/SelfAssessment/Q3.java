package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("number? ");
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                break;
            }else if (input > 0) {
                System.out.println("positive integer");
            } else {
                System.out.println("negative number");
            }
        }
    }
}