package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Base = ");
            int base = Integer.parseInt(br.readLine());

            System.out.print("Height = ");
            int height = Integer.parseInt(br.readLine());

            double triangleWidth = base * height * 0.5;
            System.out.printf("Triangle width = %.1f\n", triangleWidth);

            System.out.print("Continue? ");
            char isContinue = br.readLine().charAt(0);

            if (!(isContinue == 'Y' || isContinue == 'y')){
                break;
            }
        }
    }
}