package ProblemSolving.Warmup;

import java.util.Scanner;

public class DiagonalDifferences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int diagonal1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == i) {
                    diagonal1+=array[i][j];
                }
            }
        }
        int diagonal2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j+i == array.length-1){
                    diagonal2+=array[i][j];
                }
            }
        }
        System.out.println(Math.abs(diagonal1-diagonal2));
    }
}
