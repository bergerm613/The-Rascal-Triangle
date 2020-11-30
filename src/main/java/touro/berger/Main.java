package touro.berger;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner inputFile = new Scanner(new File("input.txt"));
            RascalTriangle triangle = new RascalTriangle();

            int dataSets = Integer.parseInt(inputFile.next());

            int row, col;
            for (int set = 0; set < dataSets; set++) {
                StringBuilder sb = new StringBuilder();

                sb.append(Integer.parseInt(inputFile.next())); //set number
                sb.append(' ');

                row = Integer.parseInt(inputFile.next());
                col = Integer.parseInt(inputFile.next());
                sb.append(triangle.getElement(row, col));

                System.out.println(sb);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
