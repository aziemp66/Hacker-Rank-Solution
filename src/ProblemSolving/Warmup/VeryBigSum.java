package ProblemSolving.Warmup;

import java.util.Scanner;

public class VeryBigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0 ;
        for (int i = 0; i < n; i++) {
            long buffer = scanner.nextLong();
            sum += buffer;
        }
        System.out.println(sum);
    }
}
