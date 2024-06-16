package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
            int input = Integer.parseInt(br.readLine());

            switch (input) {
                case 1:
                    System.out.println("\nSeoul\n");
                    break;
                case 2:
                    System.out.println("\nWashington\n");
                    break;
                case 3:
                    System.out.println("\nTokyo\n");
                    break;
                case 4:
                    System.out.println("\nBeijing\n");
                    break;
                default:
                    System.out.println("\nnone\n");
            }

            if (!(1 <= input && input <= 4)) {
                break;
            }
        }
    }
}